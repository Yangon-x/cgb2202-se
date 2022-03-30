package IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

/*
* 字符流
* java将流按照读写的数据单位划分为字节流与字符流
* java.io.InputSteram和OutputStream是所有字节输入和输出的超类
* java.io.Reader和Writer则是所有字符输入有输出流的超类
* 注意：这两对超类之间是平级的，互相没有继承关系
*
* Reader里定义了读取字符的相关方法
* Writer里定义了写出字符的相关方法
* 特点都是以char为单位
*
* 转换流
* java.io.InputSteramReader和OutputStreamWriter
* 他们是常见的字符流实现类，同时是一对高级流。实际开发中我们不会直接使用他们
* 但是在流连接中他们是重要的一环*/
public class OSDemo {
    public static void main(String[] args) throws IOException {
        //向文件osw。txt中写入文本数据
        FileOutputStream fos = new FileOutputStream("osw.txt");
        //创建转换流时，可以通过第二个参数来指定字符集
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        String line = "摩擦摩擦，在光滑的地上摩擦";

//        byte[] data = line.getBytes(StandardCharsets.UTF_8);
//        fos.write(data);

        //字符流的write方法可以直接写出字符串，无需再手动转换为字节
        osw.write(line);

        System.out.println("写出完毕！");
        osw.close();
    }

}
