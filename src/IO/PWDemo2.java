package IO;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/*
* 自行完成流连接创建PirntWriter
*
* 简易记事本工具
*
* */
public class PWDemo2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
//        FileOutputStream fos = new FileOutputStream("pw2.txt");
        //创建文件流时可以使用追加模式
        FileOutputStream fos = new FileOutputStream("pw2.txt",true);
        //创建转换流时指定字符集
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        BufferedWriter bw = new BufferedWriter(osw);
        /*
        * PrintWriter提供的构造方法中如果第一个参数是一个流，那么就可以再传入一个boolean值
        * 的参数用于指定是否要打开自动刷新功能（默认是flash）不打开
        * 当该值为true时就打开了自动刷新功能
        * 每当我们调用println方法写出一行字符串后就会自动flush一次
        * */
        PrintWriter pw = new PrintWriter(bw);
        while (true){
            System.out.println("请输入字符：");
            String line = scan.nextLine();
            if ("exit".equalsIgnoreCase(line)){
                break;
            }
            pw.println(line);
        }
        System.out.println("程序结束！");
        pw.close();

    }
}
