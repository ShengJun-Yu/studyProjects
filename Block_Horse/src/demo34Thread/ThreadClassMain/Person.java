package demo34Thread.ThreadClassMain;

/**
 * @author : Bojack
 * @date : Created in 21:24 2021.12.09
 *   ��ȡ�̵߳�����:
 *  *         1.ʹ��Thread���еķ���getName()
 *  *             String getName() ���ظ��̵߳����ơ�
 *  *         2.�����Ȼ�ȡ����ǰ����ִ�е��߳�,ʹ���߳��еķ���getName()��ȡ�̵߳�����
 *  *             static Thread currentThread() ���ضԵ�ǰ����ִ�е��̶߳�������á�
 */
public class Person extends Thread{
    @Override
    public void run() {
//        String getName() ���ظ��̵߳����ơ�
//        System.out.println(getName());
//        static Thread currentThread() ���ضԵ�ǰ����ִ�е��̶߳�������á�
        System.out.println(currentThread());
    }
}
