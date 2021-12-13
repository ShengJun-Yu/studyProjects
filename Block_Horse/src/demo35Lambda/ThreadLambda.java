package demo35Lambda;

/**
 * @author : Bojack
 * @date : Created in 21:06 2021.12.13
 *     Lambda���ʽ�ı�׼��ʽ:
 *         �����������:
 *             a.һЩ����
 *             b.һ����ͷ
 *             c.һ�δ���
 *         ��ʽ:
 *             (�����б�) -> {һЩ��д�����Ĵ���};
 *         ����˵����ʽ:
 *             ():�ӿ��г��󷽷��Ĳ����б�,û�в���,�Ϳ���;�в�����д������,�������ʹ�ö��ŷָ�
 *             ->:���ݵ���˼,�Ѳ������ݸ�������{}
 *             {}:��д�ӿڵĳ��󷽷��ķ�����
 */
public class ThreadLambda {
    public static void main(String[] args) {
//        ��������̣�ֱ��ʹ�������ӿ�ʵ�ֶ��߳�
        new Thread(new Runnable() {
                @Override
                public void run(){
                    System.out.println(Thread.currentThread().getName() + "�߳�1");
                }
            }).start();
//        ��������� jdk8��lambda���ʽʵ�����������
        new Thread(()->{
                System.out.println(Thread.currentThread().getName() + "�߳�2");
            }
        ).start();
    }
}
