package file;

import java.io.File;

public class DeleteDirDemo {
    public static void main(String[] args) {
        File file = new File("demo.txt");
        if (file.exists()){
            file.delete();
            System.out.println("该目录已删除");
        }else {
            System.out.println("改文件不存在");
        }
    }
}
