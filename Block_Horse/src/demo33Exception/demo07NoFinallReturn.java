package demo33Exception;

/**
 * @author : Bojack
 * @date : Created in 21:03 2021.12.08
 * 如果finally有return语句,永远返回finally中的结果,避免该情况.
 */
public class demo07NoFinallReturn {
    public static void main(String[] args) {
        int a = demo();
        System.out.println(a);
    }

    public static int demo() {
        try {
            int a = 10;
            return a;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            //永远返回finally的数，避免该情况产生
            int a = 9;
            return a;
        }
    }
}
