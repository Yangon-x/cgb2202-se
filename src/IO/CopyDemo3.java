package IO;

import java.io.*;

/*
* java将流分为两类：节点流与处理流
* 节点流：又称低级流，是实际连接我们程序与另一端的“管道”负责实际读写我们数据的流
*       ！！！！读写一定是建立在低级流的基础上进行的！
* 处理流：又称高级流，过滤流，不能独立存在，必须建立在其他流上，
*       目的是当数据流经它时对数据进行某种加工处理，简化我们的操作
*
* 流的连接：实际开发中
*
* 缓冲流：
* java.io.Buff
* 缓冲流在流连接中的作用是加快读写效率
* */
public class CopyDemo3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("ppt.pptx");
        BufferedInputStream bis = new BufferedInputStream(fis);
        FileOutputStream fos= new FileOutputStream("ppt_cp.pptx");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        int d = 0;
        long start = System.currentTimeMillis();
        while ((d = bis.read())!= -1){
            bos.write(d);
        }
        long end = System.currentTimeMillis();


    }
}
