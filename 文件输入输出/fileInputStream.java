package javaSE_12;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class fileInputStream {
   //文件输出流

    public String fileInputStream(String filePath) throws IOException {
        File fileName = new File(filePath);
        String encoding = "UTF-8";
        Long filelength = fileName.length();
        byte[] filecontent = new byte[filelength.intValue()];
        FileInputStream in = new FileInputStream(fileName);
        in.read(filecontent);
        in.close();
        return new String(filecontent,encoding);
    }

}
