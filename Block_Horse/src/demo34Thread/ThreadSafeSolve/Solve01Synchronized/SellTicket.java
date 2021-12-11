package demo34Thread.ThreadSafeSolve.Solve01Synchronized;

/**
 * @author : Bojack
 * @date : Created in 20:23 2021.12.11
 * ��Ʊ�����������̰߳�ȫ����
 * �����˲����ڵ�Ʊ���ظ���Ʊ
 * ����̰߳�ȫ�����һ�ַ���:ʹ��ͬ�������
 * ��ʽ:
 * synchronized(������){
 * ���ܻ�����̰߳�ȫ����Ĵ���(�����˹������ݵĴ���)
 * }
 * ע��:
 * 1.ͨ��������е�������,����ʹ������Ķ���
 * 2.���Ǳ��뱣֤����߳�ʹ�õ���������ͬһ��
 * 3.����������:
 * ��ͬ���������ס,ֻ��һ���߳���ͬ���������ִ��
 */
public class SellTicket implements Runnable {
    private int ticket = 100;
    Object obj = new Object();

    @Override
    public void run() {
//        ʹ��synchronized ��ͬ���������ס,ֻ��һ���߳���ͬ���������ִ��
        synchronized (obj) {
            while (true) {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "==����������" + ticket + "��Ʊ");
                    ticket--;
                }
            }
        }
    }
}
