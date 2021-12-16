package com.example;

import java.io.*;

public class TestMain {
    public static void main(String[] args) throws IOException {
        TestEntity[] stuArray={
                new TestEntity("张三","1001",18),
                new TestEntity("李四","1002",16),
                new TestEntity("王二","1003",19),
                new TestEntity("李百","1004",20)
        };
        String filePath = "D:\\workspace\\test.txt";
        File file = new File(filePath.substring(0,filePath.lastIndexOf("\\")));
        if (!file.exists()){
            file.mkdirs();
        }
        File fileTxt = new File(filePath);
        if (!fileTxt.exists()){
            fileTxt.createNewFile();
        }
        FileOutputStream stu_out = new FileOutputStream();
        stu_out.fileOutStream(filePath,stuArray);


        FileInputStream stu_input = new FileInputStream();
        String students = stu_input.fileInputStream(filePath);
        System.out.println("姓名 学号 年龄");
        System.out.println(students);
    }
}
