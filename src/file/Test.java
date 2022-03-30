package file;

import java.io.File;
import java.io.FileFilter;

/*
* 获取./src/file目录下所所有名字“D"开头的子项
* */
public class Test {
    public static void main(String[] args) {
        File dir = new File("./src/file");
        if (dir.isDirectory()){
            FileFilter filter = new FileFilter() {
                public boolean accept(File file) {
//                    String name = file.getName();
//                    System.out.println("正在过滤："+ file.getName());
                    return file.getName().startsWith("D");
                }
            };
            File[] subs = dir.listFiles(filter);
            System.out.println("共：" + subs.length+"个子项");
            for (int i = 0; i < subs.length; i++) {
                File sub = subs[i];
                System.out.println(sub.getName());
            }
        }
    }
}
