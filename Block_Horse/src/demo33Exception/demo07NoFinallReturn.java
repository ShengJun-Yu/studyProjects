package demo33Exception;

/**
 * @author : Bojack
 * @date : Created in 21:03 2021.12.08
 * ���finally��return���,��Զ����finally�еĽ��,��������.
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
            //��Զ����finally������������������
            int a = 9;
            return a;
        }
    }
}
