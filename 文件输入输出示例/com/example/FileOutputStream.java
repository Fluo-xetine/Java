package com.example;

import java.io.File;
import java.io.IOException;

public class FileOutputStream {

    //文件输入流
    public void fileOutStream(String filePath, TestEntity[] a) throws IOException {
        File fileName = new File(filePath);
        String encoding = "GBK";
        for (TestEntity b:a) {
            byte[] c = b.toString().getBytes();
            java.io.FileOutputStream out = new java.io.FileOutputStream(fileName,true);
            out.write(c);
            out.close();
        }

    }
}
