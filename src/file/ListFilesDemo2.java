package file;

import java.io.File;
import java.io.FileFilter;

/*
* filter:过滤器
* accept:接受
* 有条件的获取一个目录中的子项
*
* File有一个重载的listFiles方法，允许我们传入一个文件过滤器，并在该过滤器上定义过滤条件
* 之后listFiles执行完毕会将目录中所有满足过滤要求的子项进行返回
* */
public class ListFilesDemo2 {
    public static void main(String[] args) {
        File dir = new File(".");
        if (dir.isDirectory()){
            FileFilter filter = new FileFilter() {
                public boolean accept(File file) {
                    return file.getName().contains("o");
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
