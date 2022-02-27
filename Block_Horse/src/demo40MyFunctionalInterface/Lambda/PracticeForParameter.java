package demo40MyFunctionalInterface.Lambda;

/**
 * @author : Bojack
 * @date : Created in 19:49 2022.02.27
 * ����java.lang.Runnable�ӿھ���һ������ʽ�ӿڣ�
 * ������һ��startThread����ʹ�øýӿ���Ϊ��������ô�Ϳ���ʹ��Lambda���д��Ρ�
 * ���������ʵ��Thread��Ĺ��췽������ΪRunnableû�б�������
 */
public class PracticeForParameter {
    public static void startThread(Runnable r) {
        new Thread(r).start();
    }

    public static void main(String[] args) {
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"-->����");
            }
        });
        //lambda���ʽ
        startThread(()->{
            System.out.println(Thread.currentThread().getName()+"-->����");
        });
    }
}
