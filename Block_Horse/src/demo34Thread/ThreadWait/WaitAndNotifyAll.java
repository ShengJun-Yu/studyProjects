package demo34Thread.ThreadWait;

/**
 * @author : Bojack
 * @date : Created in 17:52 2021.12.13
 * 进入到TimeWaiting(计时等待)有两种方式
 * 1.使用sleep(long m)方法,在毫秒值结束之后,线程睡醒进入到Runnable/Blocked状态
 * 2.使用wait(long m)方法,wait方法如果在毫秒值结束之后,还没有被notify唤醒,就会自动醒来,线程睡醒进入到Runnable/Blocked状态
 * <p>
 * 唤醒的方法:
 * void notify() 唤醒在此对象监视器上等待的单个线程。
 * void notifyAll() 唤醒在此对象监视器上等待的所有线程。
 */
public class WaitAndNotifyAll {
    public static void main(String[] args) {
        Object obj = new Object();

//        顾客1
        new Thread() {
            @Override
            public void run() {
                synchronized (obj) {
                    System.out.println("顾客1买包子，知老板要的包子的种类和数量");
                    try {
                        obj.wait(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("顾客1吃完了，真好吃！！！");
                }
            }
        }.start();

//        顾客二
        new Thread() {
            @Override
            public void run() {
                synchronized (obj) {
                    System.out.println("顾客二买包子，知老板要的包子的种类和数量");
                    try {
                        obj.wait(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("顾客二吃完了，真好吃！！！");
                }
            }
        }.start();


//        老板
        new Thread() {
            @Override
            public void run() {
                synchronized (obj) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("做包子，做好告诉顾客");
//                    obj.notifyAll();
                }
            }
        }.start();
    }
}
