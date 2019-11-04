package javaSE_12;

import java.io.*;

public class Java4 {
    public static void main(String[] args) throws IOException {
        Student[] stuArray={
                new Student("张三","1001",18),
                new Student("李四","1002",16),
                new Student("王二","1003",19),
                new Student("李百","1004",20)
        };
        fileOutputStream stu_out = new fileOutputStream();
        File file = new File("E:\\workspace\\javaSE_workspace\\student.txt");
        if (!file.exists()){
            file.createNewFile();
        }
       stu_out.fileOutStream("E:\\workspace\\javaSE_workspace\\student.txt",stuArray);


        fileInputStream stu_input = new fileInputStream();
        String students = stu_input.fileInputStream("E:\\workspace\\javaSE_workspace\\student.txt");
        System.out.println("姓名 学号 年龄");
        System.out.println(students);
    }
}
