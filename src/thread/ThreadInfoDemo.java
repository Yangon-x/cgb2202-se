package thread;

public class ThreadInfoDemo {
    public static void main(String[] args) {
        Thread main = Thread.currentThread();//获取主线程进行查看

        String name = main.getName();//获取线程的名字
        System.out.println(name);

        long id = main.getId();//获取线程的唯一标识
        System.out.println(id);

        //priority
        int priority = main.getPriority();//获取线程的优先级
        System.out.println(priority);
        boolean isInterrupted = main.isInterrupted();
        System.out.println("是否被中断"+isInterrupted);
        boolean isDaemon = main.isDaemon();
        System.out.println("是否为守护线程"+isDaemon);
        boolean isAlive = main.isAlive();
        System.out.println("是否活着"+isAlive);
    }

}
