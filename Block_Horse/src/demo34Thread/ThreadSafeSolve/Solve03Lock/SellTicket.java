package demo34Thread.ThreadSafeSolve.Solve03Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author : Bojack
 * @date : Created in 20:23 2021.12.11
 * ��Ʊ�����������̰߳�ȫ����
 * *     �����˲����ڵ�Ʊ���ظ���Ʊ
 * <p>
 * ����̰߳�ȫ��������ַ���:ʹ��Lock��
 * java.util.concurrent.locks.Lock�ӿ�
 * Lock ʵ���ṩ�˱�ʹ�� synchronized ���������ɻ�õĸ��㷺������������
 * Lock�ӿ��еķ���:
 * void lock()��ȡ����
 * void unlock()  �ͷ�����
 * java.util.concurrent.locks.ReentrantLock implements Lock�ӿ�
 * ʹ�ò���:
 * 1.�ڳ�Աλ�ô���һ��ReentrantLock����
 * 2.�ڿ��ܻ���ְ�ȫ����Ĵ���ǰ����Lock�ӿ��еķ���lock��ȡ��
 * 3.�ڿ��ܻ���ְ�ȫ����Ĵ�������Lock�ӿ��еķ���unlock�ͷ���
 */
public class SellTicket implements Runnable {
    private int ticket = 100;
//    1.�ڳ�Աλ�ô���һ��ReentrantLock����
    Lock l = new ReentrantLock();

    @Override
    public void run() {
//        while (true) {
//            l.lock();
//            if (ticket > 0) {
//                System.out.println(Thread.currentThread().getName() + "==����������" + ticket + "��Ʊ");
//                ticket--;
//            }
//            l.unlock();
//        }
        while (true) {
            try {
//                2.�ڿ��ܻ���ְ�ȫ����Ĵ���ǰ����Lock�ӿ��еķ���lock��ȡ��
                l.lock();
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "==����������" + ticket + "��Ʊ");
                    ticket--;
                }
            }catch (Exception e){
                System.out.println(e);
            }finally {
//                3.�ڿ��ܻ���ְ�ȫ����Ĵ�������Lock�ӿ��еķ���unlock�ͷ���
                l.unlock();//���۳����Ƿ��쳣,��������ͷ�
            }
        }
    }
}
