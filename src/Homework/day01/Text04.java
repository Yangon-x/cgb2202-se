package Homework.day01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/*
 * 改正下面程序的错误
 *
 * 程序实现的功能需求:复制一个文件*/
public class Text04 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("img.jpeg");
        FileOutputStream fos = new FileOutputStream("img_cp.jpeg");
        int d;
        while ((d = fis.read()) != -1) {
            fos.write(d);
        }
        System.out.println("复制完毕!");
        fis.close();
        fos.close();

    }
}
