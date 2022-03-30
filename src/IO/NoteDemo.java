package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/*
* 完成一个简易记事本工具
* 要求：程序启动后，将用户在控制台上输入的每一行字符串都写入文件note.txt中
* 当用户单独输入exit时程序退出*/
public class NoteDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("note.txt",true);
        Scanner scan = new Scanner(System.in);
//        String line;
//        byte[] data;
//        do {
//            System.out.println("请输入字符：");
//            line = scan.nextLine();
//             data = line.getBytes(StandardCharsets.UTF_8);
//            fos.write(data);
//        }while (!("exit".equals(line)));
        //简单
//        while(true){
//            String line = scan.nextLine();
//            if ("exit".equals(line)){
//                break;
//            }
//            byte[] data = line.getBytes(StandardCharsets.UTF_8);
//            fos.write(data);
//        }
        //进阶
        String i;
        byte[] b;
//        while (){
//
//        }
        System.out.println("程序退出");
        fos.close();
    }
}
