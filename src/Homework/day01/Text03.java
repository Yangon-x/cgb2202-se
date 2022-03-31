package Homework.day01;
/*
 *改错练习:
 *   程序启动后要求用户输入一个关键字，然后列出当前项目下所有
 *   名字中包含该关键字的子项
 * */

import java.io.File;
import java.util.Scanner;

/*
 * key  计算机中为“关键”的含义
 * dir   单词directory的缩写，目录
 * list  列表
 * */
public class Text03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//键盘扫描器
        System.out.println("请输入关键字：");
        String k = scan.nextLine();//输入
        File dir = new File(".");//获取文件当前目录
        if (dir.isDirectory()){
            File files[] = dir.listFiles();
            for (int i = 0; i < files.length; i++) {
                String fileName = files[i].getName();
                if (fileName.contains(k)){
                    System.out.println(fileName);
                }
            }
        }

    }
}
