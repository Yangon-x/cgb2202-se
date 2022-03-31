package socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/*
* 聊天室服务端*/
public class Server {
    /**
     * java.net.ServerSocket
     * ServerSocket是运行在服务端上的。其主要有两个作用
     * 1:向服务端申请服务端口(客户端Socket就是通过这个端口与服务端建立连接的)
     * 2:监听服务端口，一旦客户端连接会立即常见一个Socket，通过该Socket与客户端交互
     *
     * 如果我们将Socket比喻为"电话"，那么ServerSocket相当于"总机"
     */
    private ServerSocket serverSocket;

    public Server(){

            try {
            /*
                ServerSocket在创建的时候要申请一个固定的端口号，客户端才能通过这个
                端口建立连接。
                如果该端口被当前操作系统中其他程序使用了，那么这里实例化会抛出异常:
                java.net.BindException:address already in use
                绑定异常:地址被使用了
             */
                System.out.println("正在启动服务端。。");
                serverSocket = new ServerSocket(8088);
                System.out.println("服务端启动完毕");
            } catch (IOException e) {
                e.printStackTrace();
            }
}

    public void start(){
        try{
            /*
                ServerSocket的accept方法是一个阻塞方法。
                开始等待客户端的连接，一旦一个客户端通过端口建立连接，此时accept方法
                会立即返回一个Socket实例。通过该实例可以与该客户端进行交互。
                相当于是接电话的动作。
                阻塞方法:调用后，程序就"卡住"不往下执行了。
             */
            while(true){
                System.out.println("等待客户端连接");
                Socket socket = serverSocket.accept();
                System.out.println("第"+"个客户端连接了！");

//                InputStream in = socket.getInputStream();
//                InputStreamReader isr = new InputStreamReader(in, StandardCharsets.UTF_8);
//                BufferedReader br = new BufferedReader(isr);
//
//                String line;
//
//                while ((line = br.readLine())!=null) {
//                    System.out.println("客户端说：" + line);
//                }
            }

//
//            //
//            InputStream in = socket.getInputStream();
//            InputStreamReader isr = new InputStreamReader(in, StandardCharsets.UTF_8);
//            BufferedReader br = new BufferedReader(isr);
//
//            String line;
//            /*
//            * 这里的读取时底下连接的流是通过Socket获取的输入流，
//            * 当远端计算机还处于连接状态，但是暂时没有发送内容时，readLine方法会处于阻塞状态
//            * */
//            while ((line = br.readLine())!=null){
//                System.out.println("客户端说："+line);
//            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }
}
