package demo34Thread.ThreadWaitPractice;

/**
 * @author : Bojack
 * @date : Created in 19:23 2021.12.13
 */
public class Main {
    public static void main(String[] args) {
        Baozi baozi = new Baozi();
        new baoziStore(baozi).start();
        new Eating(baozi).start();
    }
}
