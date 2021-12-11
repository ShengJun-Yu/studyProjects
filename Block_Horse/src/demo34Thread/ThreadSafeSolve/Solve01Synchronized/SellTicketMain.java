package demo34Thread.ThreadSafeSolve.Solve01Synchronized;

/**
 * @author : Bojack
 * @date : Created in 20:28 2021.12.11
 */
public class SellTicketMain {
    public static void main(String[] args) {
        SellTicket sell=new SellTicket();
        Thread t1=new Thread(sell);
        Thread t2=new Thread(sell);
        Thread t3=new Thread(sell);
        t1.start();
        t2.start();
        t3.start();
    }
}
