package IO;

import java.io.FileOutputStream;
import java.io.IOException;

/*
* java使用输入输出的两个方向来规定读写操作
* 其中输入是从外界到程序的获取过程
* 输出是程序发送到外界的过程，是[写出]操作
*
* java将IO比喻为“流”
*
* java.io.InputStream和OutputStream是所有字节输入流与输出流的超类，他们是抽象类
* InputStream定义了读取字节的相关方法，OutputStream定义了写出字节的相关方法
*
* 文件流
* java.io.FileInputStream 和 FileOutputStream。他们继承自InputStream和OutputStream是实际用于读写文件的流*/
public class FOSDemo {
    public static void main(String[] args) throws IOException {
        //向文件fos.dat中写入一个字节
        /*
        * 文件输出流常用的构造方法：
        * FileOutputStream（String path）
        * FileOutputStream（File file）*/
        FileOutputStream fos = new FileOutputStream("./fos.dat");

        /*
        * viod write（int d）
        * 写出一个字节，写出的内容是给定的int值对应的2进制的“低八位”
        * fos.write(1)
        * int 整型数1的二进制
        *
        * 00000000 00000000 00000000 00000001
        *
        * fos.dot文件的内容
        * 00000001*/

        fos.write(1);

        fos.write(2);

        fos.write(98);
        System.out.println("写出完毕");
        fos.close();//写操作最终完毕后关闭流

    }
}
