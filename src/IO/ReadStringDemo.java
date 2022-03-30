package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ReadStringDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("fos.dat");

        byte[] data = new byte[1024*10];
        int len = fis.read(data);
        System.out.println("实际读取得字节数："+len);

        String line = new String(data,0,len, StandardCharsets.UTF_8);
        System.out.println(line.length());
        System.out.println(line);

        fis.close();
    }
}
