package demo35Lambda.MyselftInterface;

/**
 * @author : Bojack
 * @date : Created in 21:25 2021.12.13
 */
public class Main {
    public static void main(String[] args) {
//        �������ͳ��ʽ
        MyinterfaceImpl impl=new MyinterfaceImpl();
        System.out.println("��ͳ������");
        impl.cook();

//        �����ڲ��෽ʽ
        System.out.println("�����ڲ��෽����");
        make(new Myinterface() {
            @Override
            public void cook() {
                System.out.println("��ʦ����");
            }
        });
//        lambda��ʽ����
        System.out.println("lambda������");
        make(()-> System.out.println("��ʦ����"));
    }
    public static void make(Myinterface cookmethods){
        cookmethods.cook();
    }
}
