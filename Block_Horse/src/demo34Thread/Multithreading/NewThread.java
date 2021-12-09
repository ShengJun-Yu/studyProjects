package demo34Thread.Multithreading;

/**
 * @author : Bojack
 * @date : Created in 20:56 2021.12.09
 */
public class NewThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("New Thread"+i);
        }
    }
}
