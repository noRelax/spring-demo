package com.relax.www.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class StringManager {
    private static final Logger LOGGER = LoggerFactory.getLogger(StringManager.class);

    private StringManager(String fileName) {
        properties = new Properties();
        try {
            InputStream stream = getClass().getClassLoader().getResourceAsStream("config/" + fileName);
            properties.load(new InputStreamReader(stream, "utf-8"));
        } catch (IOException e) {
            LOGGER.error("文件：{} 读取异常 ! ", fileName, e);
        }
    }

    private Properties properties;

    private static Map<String, StringManager> cache = new HashMap<>();

    /**
     * 以相对路径读取properties中的值
     *
     * @param fileName 文件名
     * @return
     */
    public static StringManager getStringManageByFileName(String fileName) {
        StringManager mgr = cache.get(fileName);
        if (mgr == null) {
            synchronized (cache) {
                mgr = cache.get(fileName);
                if (mgr == null) {
                    mgr = new StringManager(fileName);
                    cache.put(fileName, mgr);
                }
            }
        }
        return mgr;
    }


    public String getValue(String key) {
        return properties.getProperty(key);
    }

    public String getValue(String key, Object... args) {
        String value = getValue(key);
        return formatKeyString(value, args);
    }

    public int getIntValue(String key) {
        String value = getValue(key);
        if (value == null) {
            throw new NullPointerException();
        }
        return Integer.parseInt(value);
    }


    public static String formatKeyString(String key, Object... args) {
        try {
            Object[] argsString = new Object[args.length];
            for (int i = 0; i < args.length; i++) {
                argsString[i] = args[i].toString();
            }
            return MessageFormat.format(key, argsString);
        } catch (IllegalArgumentException iae) {
            StringBuffer buf = new StringBuffer();
            buf.append(key);
            for (int i = 0; i < args.length; i++) {
                buf.append(" arg[" + i + "]=" + args[i]);
            }
            return buf.toString();
        }
    }

}
