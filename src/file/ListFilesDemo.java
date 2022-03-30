package file;

import java.io.File;

public class ListFilesDemo {
    public static void main(String[] args) {
//        File dir = new File(".");
        File dir = new File("./src/file");
        /*
        * boolean isFile()
        *判断当前File是否为一个文件
        * boolean isDirectory()
        * 判断当前File表示的是否为一个目录
        * */
        if (dir.isDirectory()){
            File[] subs = dir.listFiles();
            System.out.println("当前目录中共包含" + subs.length + "个子项");
            for (int i = 0; i < subs.length; i++) {
                File sub = subs[i];
                System.out.println(sub.getName());
            }
        }

    }
}
