package file;

import java.io.File;

/**
 * File可以表示硬盘上的一个文件或目录*/
public class FileDemo {
    public static void main(String[] args) {
       // File file = new File("../demo.txt");
        File file = new File("./demo.txt");
        File file2 = new File("./src/abc.txt");
        String name = file.getName();
        System.out.println(name);
        long length = file.length();
        System.out.println("大小"+ length + "字节");

        String name1 = file2.getName();
        System.out.println(name1);
        long length1 = file2.length();
        System.out.println("大小"+ length1 + "字节");



        boolean cw = file.canWrite();
        System.out.println("可写"+ cw);
        boolean cr = file.canRead();
        System.out.println("可读" + cr);
        boolean ih = file.isHidden();
        System.out.println("是否隐藏" + ih);

    }

}
