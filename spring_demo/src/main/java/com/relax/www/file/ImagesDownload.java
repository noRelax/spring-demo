package com.relax.www.file;

import com.google.common.io.ByteStreams;
import com.relax.www.util.StringManager;

import java.io.File;
import java.io.InputStream;
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
        URLConnection connection;
        InputStream is = null;
        for (int j = 1; j < 27; j++) {
            String filePrefix = j < 10 ? "0" + j : j + "";
            for (int i = 1; i < 100; i++) {
                String prefix = i < 10 ? "00" + i : "0" + i;
                String url = "http://www.jinfutech.com/wx/pyitem/Style/PPT/Images/item{0}-{1}.JPG?id=1";
                url = StringManager.formatKeyString(url, filePrefix, prefix);
                System.out.println(">>>>>>>>" + url);
                try {
                    connection = new URL(url).openConnection();
                    is = connection.getInputStream();
                    connection.setConnectTimeout(30000);
                    connection.setReadTimeout(30000);
                } catch (Exception e) {
                    break;
                }
                String pathStr = StringManager.formatKeyString("/学习资料/downloads/{0}/", filePrefix);
                File pathFile = new File(pathStr);
                String fileName = StringManager.formatKeyString(pathStr + File.separator + "{0}.jpg", prefix);
                File file = new File(fileName);
                try {
                    if (!pathFile.exists()) {
                        pathFile.mkdirs();
                        file.createNewFile();
                    }
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    Files.write(file.toPath(), ByteStreams.toByteArray(is));
                } catch (Exception e) {

                }
            }
            try {
                is.close();
            } catch (Exception e) {

            }
        }
    }
}
