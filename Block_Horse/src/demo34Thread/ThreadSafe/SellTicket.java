package demo34Thread.ThreadSafe;

/**
 * @author : Bojack
 * @date : Created in 20:23 2021.12.11
 * ��Ʊ�����������̰߳�ȫ����
 * *     �����˲����ڵ�Ʊ���ظ���Ʊ
 */
public class SellTicket implements Runnable {
    private int ticket = 100;

    @Override
    public void run() {
        while (true) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "==����������" + ticket + "��Ʊ");
                ticket--;
            }
        }
    }
}
