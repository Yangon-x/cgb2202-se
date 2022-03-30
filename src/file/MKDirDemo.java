package file;

import java.io.File;

public class MKDirDemo {
    public static void main(String[] args) {
//        File dir = new File("./demo.txt");
        File dir = new File("z/x/c/v/b/demo.txt");
        if (dir.exists()){
            System.out.println("该目录已存在");
        }else {
//            dir.mkdir();
            dir.mkdirs();
            System.out.println("该目录已创建");
        }
    }
}
