package demo34Thread.ThreadClassMain;

/**
 * @author : Bojack
 * @date : Created in 21:24 2021.12.09
 * ��ȡ�̵߳�����:
 * *         1.ʹ��Thread���еķ���getName()
 * *             String getName() ���ظ��̵߳����ơ�
 * *         2.�����Ȼ�ȡ����ǰ����ִ�е��߳�,ʹ���߳��еķ���getName()��ȡ�̵߳�����
 * *             static Thread currentThread() ���ضԵ�ǰ����ִ�е��̶߳�������á�
 * �����̵߳�����:(�˽�)
 * *         1.ʹ��Thread���еķ���setName(����)
 * *             void setName(String name) �ı��߳����ƣ�ʹ֮����� name ��ͬ��
 * *         2.����һ���������Ĺ��췽��,���������̵߳�����;���ø���Ĵ��ι��췽��,���߳����ƴ��ݸ�����,�ø���(Thread)�����߳���һ������
 * *             Thread(String name) �����µ� Thread ����
 */
public class Person extends Thread {
    public Person() {
    }


    public Person(String name) {
        super(name);
    }

    @Override
    public void run() {
        //        String getName() ���ظ��̵߳����ơ�
//        System.out.println(getName());
//        static Thread currentThread() ���ضԵ�ǰ����ִ�е��̶߳�������á�
        System.out.println(currentThread());
    }
}
