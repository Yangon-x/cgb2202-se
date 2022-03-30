package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* 通过提高单词读写的数据量，减少实际读写的次数，提高读写速度
*
* 单字节读写属于随机读写
*
* */
public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("1.jpg");
        FileOutputStream fos = new FileOutputStream("1_cp.jpg");
        byte[] data = new byte[1024*10];
        int len;
        long start = System.currentTimeMillis();
        while ((len = fis.read(data))!= -1){
//            fos.write(data);
            fos.write(data,0,len);
        }
        long end = System.currentTimeMillis();
        System.out.println("复制完毕！耗时：" +(end-start)+"ms");
        fis.close();
        fos.close();

    }
}
