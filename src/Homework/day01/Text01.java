package Homework.day01;

import java.io.File;
import java.io.FileFilter;

/*
 * FileFilter 文件过滤器
 * accept       接受
 * */
public class Text01 {
//    public static void main(String[] args) {
//        // 列出当前目录中所有名字包含s的子项。
//        File dir = new File(".");
//        if (dir.isDirectory()){
//            //匿名内部类
//            FileFilter filter = new FileFilter() {
//                @Override
//                public boolean accept(File pathname) {
////                    String name = pathname.getName();
////                    System.out.println("正在过滤：" + pathname.getName());//打桩
//                    return pathname.getName().contains("s");
//                }
//            };
//            File[] subs = dir.listFiles(filter);
//            System.out.println("共" + subs.length+"个包含s的项目");
//            for (int i = 0; i < subs.length; i++) {
//                File sub = subs[i];
//                System.out.println(sub.getName());
//            }
//            //lambda
////            File[] subs = dir.listFiles(f->f.getName().contains("s"));
////            for (int i = 0; i < subs.length; i++) {
////                System.out.println(subs[i].getName());
////            }
//        }
//    }

    /*按照正确顺序排列代码并解释标注语句*/
    public static void main(String[] args) {
        //通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例
        File dir = new File(".");
        //测试此抽象路径名表示的文件是否是一个目录。当且仅当此抽象路径名表示的文件存在且 是一个目录时，
        // 返回 true；否则返回 false
        if(dir.isDirectory()){
            //返回抽象路径名数组，
            // 这些路径名表示此抽象路径名表示的目录中
            // 满足指定过滤器的文件和目录。
            File[] subs = dir.listFiles(new FileFilter() {
                public boolean accept(File file) {
                    //【在这里标注该句代码意义】
                    return file.getName().contains("s");
                }
            });
            //【在这里标注该句代码意义】
            for(int i=0;i<subs.length;i++){
                //返回由此抽象路径名表示的文件或目录的名称。
                System.out.println(subs[i].getName());
            }
        }
    }
}
