package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/*向文件中写入文本数据*/
public class WriteStringDemo {
    public static void main(String[] args) throws IOException {
//        FileOutputStream fos = new FileOutputStream("fos.txt");
        FileOutputStream fos = new FileOutputStream("fos.txt",true);
        /*
        * String提供了一个方法：getByte是（）可以将字符串按指定字符集转换为对应的一组字节。
        * 参数指定的就是字符集，用StandardCharsets.UTF_8
        * */
        String line = "天青色等烟雨，而我在等你,月色半打捞起，晕开了结局，如传世的青花瓷自顾自美丽";
        byte[] data = line.getBytes(StandardCharsets.UTF_8);
        fos.write(data);
        System.out.println("写入完毕");
        fos.close();
    }
}
