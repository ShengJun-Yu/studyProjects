package demo34Thread.IntefaceThread;

/**
 * @author : Bojack
 * @date : Created in 19:04 2021.12.11
 *     �������̳߳���ĵڶ��ַ�ʽ:ʵ��Runnable�ӿ�
 *     java.lang.Runnable
 *         Runnable �ӿ�Ӧ������Щ����ͨ��ĳһ�߳�ִ����ʵ��������ʵ�֡�����붨��һ����Ϊ run ���޲���������
 *     java.lang.Thread��Ĺ��췽��
 *         Thread(Runnable target) �����µ� Thread ����
 *         Thread(Runnable target, String name) �����µ� Thread ����
 *
 *     ʵ�ֲ���:
 *         1.����һ��Runnable�ӿڵ�ʵ����
 *         2.��ʵ��������дRunnable�ӿڵ�run����,�����߳�����
 *         3.����һ��Runnable�ӿڵ�ʵ�������
 *         4.����Thread�����,���췽���д���Runnable�ӿڵ�ʵ�������
 *         5.����Thread���е�start����,�����µ��߳�ִ��run����
 *
 *     ʵ��Runnable�ӿڴ������̳߳���ĺô�:
 *         1.�����˵��̳еľ�����
 *             һ����ֻ�ܼ̳�һ����(һ����ֻ����һ���׵�),��̳���Thread��Ͳ��ܼ̳���������
 *             ʵ����Runnable�ӿ�,�����Լ̳���������,ʵ�������Ľӿ�
 *         2.��ǿ�˳������չ��,�����˳���������(����)
 *             ʵ��Runnable�ӿڵķ�ʽ,�������߳�����Ϳ������߳̽����˷���(����)
 *             ʵ������,��д��run����:���������߳�����
 *             ����Thread�����,����start����:�����������߳�
 */
public class demoRunnable {
    public static void main(String[] args) {
        RunnableImpl run=new RunnableImpl();
        Thread t=new Thread(run);
        t.setName("jun");
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"==>"+i);
        }
    }
}
