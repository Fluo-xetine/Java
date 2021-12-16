package com.example;

import java.io.File;
import java.io.IOException;

public class FileInputStream {

   //文件输出流
    public String fileInputStream(String filePath) throws IOException {
        File fileName = new File(filePath);
        String encoding = "UTF-8";
        Long filelength = fileName.length();
        byte[] filecontent = new byte[filelength.intValue()];
        java.io.FileInputStream in = new java.io.FileInputStream(fileName);
        in.read(filecontent);
        in.close();
        return new String(filecontent,encoding);
    }

}
