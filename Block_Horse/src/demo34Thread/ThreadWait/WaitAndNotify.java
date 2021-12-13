package demo34Thread.ThreadWait;

/**
 * @author : Bojack
 * @date : Created in 17:52 2021.12.13
 * �ȴ����Ѱ���:�߳�֮���ͨ��
 * ����һ���˿��߳�(������):��֪�ϰ�Ҫ�İ��ӵ����������,����wait����,����cpu��ִ��,���뵽WAITING״̬(���޵ȴ�)
 * ����һ���ϰ��߳�(������):����5��������,���ð���֮��,����notify����,���ѹ˿ͳ԰���
 * <p>
 * ע��:
 * �˿ͺ��ϰ��̱߳���ʹ��ͬ��������������,��֤�ȴ��ͻ���ֻ����һ����ִ��
 * ͬ��ʹ�õ���������뱣֤Ψһ
 * ֻ����������ܵ���wait��notify����
 * <p>
 * Obejct���еķ���
 * void wait()
 * �������̵߳��ô˶���� notify() ������ notifyAll() ����ǰ�����µ�ǰ�̵߳ȴ���
 * void notify()
 * �����ڴ˶���������ϵȴ��ĵ����̡߳�
 * �����ִ��wait����֮��Ĵ���
 */
public class WaitAndNotify {
    public static void main(String[] args) {
        Object obj = new Object();

        new Thread() {
            @Override
            public void run() {
                synchronized (obj) {
                    System.out.println("����ӣ�֪�ϰ�Ҫ�İ��ӵ����������");
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("�����ˣ���óԣ�����");
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                synchronized (obj) {
                    try {
                        Thread.sleep(30);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("�����ӣ����ø��߹˿�");
                    obj.notify();
                }
            }
        }.start();
    }
}
