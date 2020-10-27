package com.relax.www.file;

import com.google.common.io.ByteStreams;
import com.relax.www.util.StringManager;
import org.junit.Test;

import java.io.File;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;

/**
 * 图片下载
 *
 * @author wusong
 * @create 2020-10-26 12:31
 **/
public class ImagesDownload {
    public static void main(String[] args) {
        for (int j = 1; j < 27; j++) {
            String director = j < 10 ? "0" + j : j + "";
            String pathStr = StringManager.formatKeyString("/学习资料/downloads/{0}/", director);
            for (int i = 1; i < 100; i++) {
                String prefix = i < 10 ? "00" + i : "0" + i;
                String url = "http://www.jinfutech.com/wx/pyitem/Style/PPT/Images/item{0}-{1}.JPG?id=1";
                url = StringManager.formatKeyString(url, director, prefix);
                System.out.println(">>>>>>>>" + url);
                try {
                    download(url, pathStr, prefix);
                } catch (Exception e) {
                    break;
                }
            }
        }
    }

    /**
     * 通用文件下载类
     *
     * @param url          图片下载地址
     * @param directorPath 下载路径
     * @param prefix       文件前缀
     * @throws Exception
     */
    public static void download(String url, String directorPath, String prefix) throws Exception {
        URLConnection connection = new URL(url).openConnection();
        try (InputStream is = connection.getInputStream()) {
            connection.setConnectTimeout(30000);
            connection.setReadTimeout(30000);
            String fileName = StringManager.formatKeyString(directorPath + File.separator + "{0}.jpg", prefix);
            File file = new File(fileName);
            File pathFile = new File(directorPath);
            if (!pathFile.exists()) {
                pathFile.mkdirs();
                file.createNewFile();
            }
            if (!file.exists()) {
                file.createNewFile();
            }
            Files.write(file.toPath(), ByteStreams.toByteArray(is));
        }


    }
}
