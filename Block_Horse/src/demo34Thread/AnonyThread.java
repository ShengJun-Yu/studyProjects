package demo34Thread;

import demo34Thread.IntefaceThread.RunnableImpl;

/**
 * @author : Bojack
 * @date : Created in 19:48 2021.12.11
 *     �����ڲ��෽ʽʵ���̵߳Ĵ���
 *
 *     ����:û������
 *     �ڲ���:д���������ڲ�����
 *
 *     �����ڲ�������:�򻯴���
 *         ������̳и���,��д����ķ���,������������һ�����
 *         ��ʵ����ʵ����ӿ�,��д�ӿ��еķ���,����ʵ�������ϳ�һ�����
 *     �����ڲ�������ղ���:����/ʵ�������,�������û������
 *
 *     ��ʽ:
 *         new ����/�ӿ�(){
 *             �ظ�����/�ӿ��еķ���
 *         };
 */
public class AnonyThread {
    public static void main(String[] args) {
//        �����ڲ���ʵ�ֶ��߳�
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName()+"�����ڲ���==>"+i);
                }
            }
        }.start();
//        �����ӿ�ʵ�ֶ��߳�
        Runnable r = new RunnableImpl() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "�����ӿ�==>" + i);
                }
            }
        };
        new Thread(r).start();
//        ���д��
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "���ӿ�==>" + i);
                }
            }
        }).start();
    }


}