package demo34Thread.ThreadClassMain;

/**
 * @author : Bojack
 * @date : Created in 21:24 2021.12.09
 *    ��ȡ�̵߳�����:
 *         1.ʹ��Thread���еķ���getName()
 *             String getName() ���ظ��̵߳����ơ�
 *         2.�����Ȼ�ȡ����ǰ����ִ�е��߳�,ʹ���߳��еķ���getName()��ȡ�̵߳�����
 *             static Thread currentThread() ���ضԵ�ǰ����ִ�е��̶߳�������á�
 */
public class demo01GetnameAndCurrentThread {
    public static void main(String[] args) {
        Person p=new Person();
        p.start();
        new Person().start();
        new Person().start();
        System.out.println(Thread.currentThread().getName());
    }
}
