package demo34Thread.MainThread;

/**
 * @author : Bojack
 * @date : Created in 20:40 2021.12.09
 * <p>
 * ���߳�:ִ����(main)�������߳�
 * <p>
 * ���̳߳���:java������ֻ��һ���߳�
 * ִ�д�main������ʼ,���ϵ�������ִ��
 * <p>
 * JVMִ��main����,main��������뵽ջ�ڴ�
 * JVM���Ҳ���ϵͳ����һ��main����ͨ��cpu��ִ��·��
 * cpu�Ϳ���ͨ�����·����ִ��main����
 * �����·����һ������,��main(��)�߳�
 */
public class MainThread {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.run("jun");
        Person p2 = new Person();
        p1.run("hail");
    }
}
