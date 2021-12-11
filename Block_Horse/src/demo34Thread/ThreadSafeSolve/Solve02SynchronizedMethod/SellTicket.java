package demo34Thread.ThreadSafeSolve.Solve02SynchronizedMethod;

/**
 * @author : Bojack
 * @date : Created in 20:23 2021.12.11
 * ��Ʊ�����������̰߳�ȫ����
 * �����˲����ڵ�Ʊ���ظ���Ʊ
 * <p>
 * ����̰߳�ȫ����Ķ��ַ���:ʹ��ͬ������
 * ʹ�ò���:
 * 1.�ѷ����˹������ݵĴ����ȡ����,�ŵ�һ��������
 * 2.�ڷ��������synchronized���η�
 * <p>
 * ��ʽ:���巽���ĸ�ʽ
 * ���η� synchronized ����ֵ���� ������(�����б�){
 * ���ܻ�����̰߳�ȫ����Ĵ���(�����˹������ݵĴ���)
 * }
 */
public class SellTicket implements Runnable {
    private static int ticket = 100;

    @Override
    public void run() {
        while (true) {
            sell();
        }
    }

    /*
    ��̬��ͬ������
    ��������˭?
    ������this
            this�Ǵ�������֮�������,��̬���������ڶ���
    ��̬�������������Ǳ����class����-->class�ļ�����(����)
     */
    public static /*synchronized*/ void sellStatic() {
        synchronized (Thread.class) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "==����������" + ticket + "��Ʊ");
                ticket--;
            }
        }
    }
    /*
    ����һ��ͬ������shu();
        ͬ������Ҳ��ѷ����ڲ��Ĵ�����ס
        ֻ��һ���߳�ִ��
        ͬ����������������˭?
        ����ʵ������� new RunnableImpl()
        Ҳ�Ǿ���this
     */
    public /*synchronized*/ void sell() {
        synchronized (this) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "==����������" + ticket + "��Ʊ");
                ticket--;
            }
        }
    }
}
