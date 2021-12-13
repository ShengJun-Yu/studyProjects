package demo34Thread.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author : Bojack
 * @date : Created in 20:08 2021.12.13
 * �̳߳�:JDK1.5֮���ṩ��
 * java.util.concurrent.Executors:�̳߳صĹ�����,���������̳߳�
 * Executors���еľ�̬����:
 * static ExecutorService newFixedThreadPool(int nThreads) ����һ�������ù̶��߳������̳߳�
 * ����:
 * int nThreads:�����̳߳��а������߳�����
 * ����ֵ:
 * ExecutorService�ӿ�,���ص���ExecutorService�ӿڵ�ʵ�������,���ǿ���ʹ��ExecutorService�ӿڽ���(����ӿڱ��)
 * java.util.concurrent.ExecutorService:�̳߳ؽӿ�
 * �������̳߳��л�ȡ�߳�,����start����,ִ���߳�����
 * submit(Runnable task) �ύһ�� Runnable ��������ִ��
 * �ر�/�����̳߳صķ���
 * void shutdown()
 * �̳߳ص�ʹ�ò���:
 * 1.ʹ���̳߳صĹ�����Executors����ṩ�ľ�̬����newFixedThreadPool����һ��ָ���߳��������̳߳�
 * 2.����һ����,ʵ��Runnable�ӿ�,��дrun����,�����߳�����
 * 3.����ExecutorService�еķ���submit,�����߳�����(ʵ����),�����߳�,ִ��run����
 * 4.����ExecutorService�еķ���shutdown�����̳߳�(������ִ��)
 */
public class ExcecutorsClass {
    public static void main(String[] args) {
//        1.ʹ���̳߳صĹ�����Executors����ṩ�ľ�̬����
        ExecutorService ex = Executors.newFixedThreadPool(2);
        RunnableImpl01 impl01=new RunnableImpl01();
        RunnableImpl02 impl02=new RunnableImpl02();
//        3.����ExecutorService�еķ���submit,�����߳�����(ʵ����),�����߳�,ִ��run����
        ex.submit(impl01);
        ex.submit(impl02);
//        4.����ExecutorService�еķ���shutdown�����̳߳�(������ִ��)
        ex.shutdown();


    }
//2.����һ����,ʵ��Runnable�ӿ�,��дrun����,�����߳�����
    public static class RunnableImpl01 implements Runnable {
        @Override
        public void run() {
            System.out.println("�߳�01");
        }
    }
    public static class RunnableImpl02 implements Runnable {
        @Override
        public void run() {
            System.out.println("�߳�02");
        }
    }
}
