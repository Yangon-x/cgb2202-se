package Homework.day02;

import java.io.*;

public class Text01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("test.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        FileOutputStream fos = new FileOutputStream("test_cp.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        int d = 0;
        while((d = bis.read())!= -1){
            bos.write(d);
        }
    }


}
