package thread;

/**
 * 当一个线程调用sleep方法处于睡眠阻塞的过程中其interrupt()方法被掉用，那么这时会中断
 * 该睡眠阻塞，并且sleep方法会抛出中断异常
 */
public class SleepDemo2 {
    public static void main(String[] args) {
        Thread lin = new Thread(){
            public void run(){
                System.out.println("林：睡一个美容觉吧");
                try {
                    Thread.sleep(50000000);
                } catch (InterruptedException e) {
                    System.out.println("林：干嘛呢！干嘛呢！都破相了");
                }
                System.out.println("醒了");
            }
        };
        Thread huang = new Thread() {
            public void run() {
                System.out.println("黄：大锤八十，小锤40，开始是渣墙！");
                for (int i = 0; i < 5; i++) {
                    System.out.println("黄：80！");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
                System.out.println("哐当！");
                System.out.println("黄：大哥，搞定！");
                lin.interrupt();
            }
        };
        lin.start();
        huang.start();
    }
}
