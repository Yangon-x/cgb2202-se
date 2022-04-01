package thread;
/*
* 互斥锁
* 当使用多个锁定多个代码片段，并且指定的锁对象都相同时，这些代码片段就是互斥的*/
public class SyncDemo4 {

}
class Foo{
    public synchronized void methodA(){
        try {
            Thread t = Thread.currentThread();
            System.out.println(t.getName()+":正在执行A方法");
            Thread.sleep(5000);
            System.out.println(t.getName()+":执行A方法完毕");
        } catch (InterruptedException e) {
        }
    }
}
