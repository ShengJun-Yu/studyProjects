package demo34Thread.ThreadSafe;

/**
 * @author : Bojack
 * @date : Created in 20:23 2021.12.11
 * 卖票案例出现了线程安全问题
 * *     卖出了不存在的票和重复的票
 */
public class SellTicket implements Runnable {
    private int ticket = 100;

    @Override
    public void run() {
        while (true) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "==》正在卖第" + ticket + "张票");
                ticket--;
            }
        }
    }
}
