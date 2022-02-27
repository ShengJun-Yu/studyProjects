package demo40MyFunctionalInterface.UseMyFunctionalInterface;

/**
 * @author : Bojack
 * @date : Created in 18:45 2022.02.27
 * ����ʽ�ӿڵ�ʹ��:һ�������Ϊ�����Ĳ����ͷ���ֵ����
 */
public class DemoMain {
    //����һ�������������Ϊ����ʽ�ӿ�
    public static void show(MyFunctionalInterface mfi) {
        mfi.method();
    }


    public static void main(String[] args) {
    //����show����,�����Ĳ�����һ���ӿ�,���Կ��Դ��ݽӿڵ�ʵ�������
        show(new MyFunctionalInterfaceImpl());
    //����show����,�����Ĳ�����һ���ӿ�,�������ǿ��Դ��ݽӿڵ������ڲ���
        show(new MyFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("�����ڲ�����д�ӿ��еĳ��󷽷�");
            }
        });
    //lamnda���ʽʵ��
    show(()->{
        System.out.println("lambda���ʽʵ��");
    });
    //�򻯰�
        show(()-> System.out.println("lambda���ʽ�򻯰�"));
    }

}
