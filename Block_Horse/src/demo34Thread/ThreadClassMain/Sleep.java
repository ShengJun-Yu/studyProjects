package demo34Thread.ThreadClassMain;

/**
 * @author : Bojack
 * @date : Created in 18:57 2021.12.11
 *     public static void sleep(long millis):ʹ��ǰ����ִ�е��߳���ָ���ĺ�������ͣ����ʱִֹͣ�У���
 *     ����������֮��,�̼߳���ִ��
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
