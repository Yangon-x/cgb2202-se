package IO;

import java.io.FileInputStream;
import java.io.IOException;

public class FISDemo {
    public static void main(String[] args) throws IOException {
        //将fos.dat文件的数据读取出来
        FileInputStream fis = new FileInputStream("./fos.dat");
        /*
        * int read()
        * 读取一个字节,并以int型返回，返回的int值对应的二进制的低八位为读取到的字节数据
        * 如果返回值为int的-1则表示读取到了流的末尾
        * fos.dat
        * 00000001
        * int d = fis.read()
        * d的二进制样子：
        * 00000000 00000000 00000000 00000001
        * |-------------补24个0------|  读取的字节
        * */

        int d =fis.read();
        System.out.println(d);

        d =fis.read();
        System.out.println(d);

        d =fis.read();
        System.out.println(d);

        d =fis.read();
        System.out.println(d);
        fis.close();
    }
}
