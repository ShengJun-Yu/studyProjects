package demo34Thread.ThreadSafeSolve.Solve01Synchronized;

/**
 * @author : Bojack
 * @date : Created in 20:23 2021.12.11
 * 卖票案例出现了线程安全问题
 * 卖出了不存在的票和重复的票
 * 解决线程安全问题的一种方案:使用同步代码块
 * 格式:
 * synchronized(锁对象){
 * 可能会出现线程安全问题的代码(访问了共享数据的代码)
 * }
 * 注意:
 * 1.通过代码块中的锁对象,可以使用任意的对象
 * 2.但是必须保证多个线程使用的锁对象是同一个
 * 3.锁对象作用:
 * 把同步代码块锁住,只让一个线程在同步代码块中执行
 */
public class SellTicket implements Runnable {
    private int ticket = 100;
    Object obj = new Object();

    @Override
    public void run() {
//        使用synchronized 把同步代码块锁住,只让一个线程在同步代码块中执行
        synchronized (obj) {
            while (true) {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "==》正在卖第" + ticket + "张票");
                    ticket--;
                }
            }
        }
    }
}
