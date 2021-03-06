package socket;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * 聊天室客户端
 */
public class Client {
    /*
        java.net.Socket
        Socket封装了TCP协议的通讯细节，使用它可以和服务端建立TCP连接，并基于两个流的
        读写完成数据交换。
     */
    private Socket socket;

    /*
     * 构造方法，用于初始化客户端*/
    public Client(){
        try {
            /*
            实例化Socket时常用的构造方法:
                Socket(String host,int port)
                这个构造器实例化Socket的过程就是与服务端建立连接的过程。
                参数1:服务端的IP地址
                参数2:服务端开启的服务端口
                我们通过服务端的IP可以找到网络上服务端所在的计算机。通过端口号可以找到
                该机器上的服务端应用程序从而与之建立连接。
            * */
            //本机IP地址的写法可以是“localhost”
            //176.17.10.56
            System.out.println("正在连接服务端。。。");
            socket = new Socket("176.17.10.56",8088);
            System.out.println("与服务端建立连接了！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
     * 客户端开始工作的方法*/
    public void start() {
        try {
             /*
                通过socket获取的字节输出流写出的字节会通过网络发送给远端计算机
             */
            Scanner sc = new Scanner(System.in);
            String a;
            while (sc.hasNext()) {
                a = sc.nextLine();
                if ("exit".equals(a)) {
                    break;
                }
                OutputStream os = socket.getOutputStream();
                OutputStreamWriter osw = new OutputStreamWriter(os, StandardCharsets.UTF_8);
                BufferedWriter bw = new BufferedWriter(osw);
                PrintWriter pw = new PrintWriter(bw, true);
                pw.println(a);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                /*
                 * Socket提供了close方法，可以与远端计算机断开连接
                 * 该方法调用时，也会自动关闭通过它获取的输入流和输出流
                 * */
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }
}
