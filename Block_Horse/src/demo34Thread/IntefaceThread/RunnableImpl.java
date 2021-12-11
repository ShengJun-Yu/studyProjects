package demo34Thread.IntefaceThread;

/**
 * @author : Bojack
 * @date : Created in 19:06 2021.12.11
 */
public  class RunnableImpl implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 19; i++) {
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }
    }
}
