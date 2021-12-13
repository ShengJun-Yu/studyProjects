package demo34Thread.ThreadWait;

/**
 * @author : Bojack
 * @date : Created in 17:52 2021.12.13
 * ���뵽TimeWaiting(��ʱ�ȴ�)�����ַ�ʽ
 * 1.ʹ��sleep(long m)����,�ں���ֵ����֮��,�߳�˯�ѽ��뵽Runnable/Blocked״̬
 * 2.ʹ��wait(long m)����,wait��������ں���ֵ����֮��,��û�б�notify����,�ͻ��Զ�����,�߳�˯�ѽ��뵽Runnable/Blocked״̬
 * <p>
 * ���ѵķ���:
 * void notify() �����ڴ˶���������ϵȴ��ĵ����̡߳�
 * void notifyAll() �����ڴ˶���������ϵȴ��������̡߳�
 */
public class WaitAndNotifyAll {
    public static void main(String[] args) {
        Object obj = new Object();

//        �˿�1
        new Thread() {
            @Override
            public void run() {
                synchronized (obj) {
                    System.out.println("�˿�1����ӣ�֪�ϰ�Ҫ�İ��ӵ����������");
                    try {
                        obj.wait(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("�˿�1�����ˣ���óԣ�����");
                }
            }
        }.start();

//        �˿Ͷ�
        new Thread() {
            @Override
            public void run() {
                synchronized (obj) {
                    System.out.println("�˿Ͷ�����ӣ�֪�ϰ�Ҫ�İ��ӵ����������");
                    try {
                        obj.wait(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("�˿Ͷ������ˣ���óԣ�����");
                }
            }
        }.start();


//        �ϰ�
        new Thread() {
            @Override
            public void run() {
                synchronized (obj) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("�����ӣ����ø��߹˿�");
//                    obj.notifyAll();
                }
            }
        }.start();
    }
}
