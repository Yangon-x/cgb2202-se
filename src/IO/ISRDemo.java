package IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
* 转换流
* 测试读取文本数据
* */
public class ISRDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("osw.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        /*
        * 字符流：
        * int read（）
        * 读取1个字符，将对应的char值存入返回的int值的”低16位“上
        * 如果返回的int值为-1，表示读取到了末尾
        * */
        int d = isr.read();
        while ((d= isr.read())!= -1){
            System.out.print((char)d);
        }
        fis.close();

    }
}
