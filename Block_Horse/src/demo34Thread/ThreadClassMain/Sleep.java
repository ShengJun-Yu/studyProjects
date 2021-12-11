package demo34Thread.ThreadClassMain;

/**
 * @author : Bojack
 * @date : Created in 18:57 2021.12.11
 *     public static void sleep(long millis):使当前正在执行的线程以指定的毫秒数暂停（暂时停止执行）。
 *     毫秒数结束之后,线程继续执行
 */
public class Sleep {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
