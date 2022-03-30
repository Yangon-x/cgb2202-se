package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
* 对象流
* java。io。ObjectOutputStream和ObjectInputStream
* 他们是一对高级流，在流连接中的作用是进行对象的序列化与反序列化
* 对象序列化：将对象按照其结构转化为一组字节的过程*/
public class OOSDemo extends Person{
    public static void main(String[] args) throws IOException {
        /*
        * 讲一个Person对象写入文件
        * 1.先将Person对象转化为一组字节
        * 2.将字节写入文件
        *
        * 流连接：
        *           序列化     持久化
        *             v         v
        * 对象---->对象流----->文件流----->文件*/

        String name = "苍老师";
        int age = 18;
        String gender = "女";
        String[] otherInfo = {"是一个演员","来自？？","台词较少","启蒙老师"};

        Person p = new Person(name,age,gender,otherInfo);
        FileOutputStream fos = new FileOutputStream("person.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        /*
        * 对象输出流提供了序列化方法
        * void writeObject(Object obj)
        * 将给定的对象转化为一组字节并写出，但是需要注意：写出的对象所属的类必须实现接口：
        * java.io.Serializable
        * 否则该方法会抛出异常java.io.NotSerializableException*/
        oos.writeObject(p);
        System.out.println("写出完毕！");
    }
}
