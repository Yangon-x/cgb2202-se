package IO;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/*
* 缓冲字符流
* java.io.BufferedWriter和BufferedReader
* 缓冲字符流是一对高级的字符流，作用是块写文本数据加速的
* java,io.PrintWriter
* 具有自动行刷新的缓冲字符输出流，内部总是连接BufferWriter*/
public class PWDemo1 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        //向文件pw，txt中写入文本数据
//        PrintWriter pw = new PrintWriter("pw.txt");
        PrintWriter pw = new PrintWriter("pw.txt","utf-8");
        pw.println("让我掉下眼泪的，不是昨夜的酒");
        pw.println("让我依依不舍的，不是你的温柔");
        System.out.println("写出完毕！");
        pw.close();
    }
}
