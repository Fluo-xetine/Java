package javaSE_12;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileOutputStream {

    //文件输入流
    public void fileOutStream(String filePath,Student[] a) throws IOException {
        File fileName = new File(filePath);
        String encoding = "GBK";
        for (Student b:a) {
            byte[] c = b.toString().getBytes();
            FileOutputStream out = new FileOutputStream(fileName,true);
            out.write(c);
            out.close();
        }

    }
}
