package IO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/*
* 缓冲输出流写出数据的缓冲区问题
* */
public class BOS_FlushDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("bos.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        String line = "打开吧";
        byte[] data = line.getBytes(StandardCharsets.UTF_8);
        bos.write(data);
        System.out.println("写出完毕！");
        /*
         *  缓冲流的flush方法用于强制将缓冲区中已经缓存的数据一次性写出。
         * 注：该方法实际上是在字节流的超类OutputStream上定义的，并非只有
         * 缓冲输出流这个方法。但实际上只有缓冲输出流的该方法有实际意义其他流
         * 实现该方法的目的仅仅是为了在流连接过程中传递flush动作给缓冲流输出
         * */
        bos.flush();
        bos.close();
    }
}
