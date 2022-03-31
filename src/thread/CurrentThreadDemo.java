package thread;
/*
* java中所有的代码都是靠线程运行的*/
public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread main = Thread.currentThread();//获取执行当前方法的的线程
        System.out.println("主线程："+main);
        dosome();//主线程调用dosome方法
    }
    public static void dosome(){
        Thread t = Thread.currentThread();
        System.out.println("执行dosome方法的线程是："+ t);
    }
}
