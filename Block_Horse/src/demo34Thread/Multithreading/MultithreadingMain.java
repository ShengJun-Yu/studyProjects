package demo34Thread.Multithreading;

/**
 * @author : Bojack
 * @date : Created in 20:55 2021.12.09
 * <p>
 * �������̳߳���ĵ�һ�ַ�ʽ:����Thread�������
 * java.lang.Thread��:�������̵߳���,������Ҫʵ�ֶ��̳߳���,�ͱ���̳�Thread��
 * <p>
 * ʵ�ֲ���:
 * 1.����һ��Thread�������
 * 2.��Thread�����������дThread���е�run����,�����߳�����(�����߳�Ҫ��ʲô?)
 * 3.����Thread����������
 * 4.����Thread���еķ���start����,�����µ��߳�,ִ��run����
 * void start() ʹ���߳̿�ʼִ�У�Java ��������ø��̵߳� run ������
 * ����������̲߳��������У���ǰ�̣߳�main�̣߳�����һ���̣߳����������߳�,ִ���� run ��������
 * �������һ���߳��ǷǷ��ġ��ر��ǵ��߳��Ѿ�����ִ�к󣬲���������������
 * java����������ռʽ����,�Ǹ��̵߳����ȼ���,�Ǹ��߳�����ִ��;ͬһ�����ȼ�,���ѡ��һ��ִ��
 */
public class MultithreadingMain {
    public static void main(String[] args) {
//        ����Thread����������
        NewThread thread = new NewThread();
        //        ����Thread���еķ���start����,�����µ��߳�,ִ��run����
        thread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Mutithreading" + i);
        }
    }

}
