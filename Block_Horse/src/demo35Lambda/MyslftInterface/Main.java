package demo35Lambda.MyslftInterface;

/**
 * @author : Bojack
 * @date : Created in 21:25 2021.12.13
 */
public class Main {
    public static void main(String[] args) {
//        �������ͳ��ʽ
        MyinterfaceImpl impl=new MyinterfaceImpl();
        impl.cook();

//        �����ڲ��෽ʽ
        make(new Myinterface() {
            @Override
            public void cook() {
                System.out.println("��ʦ����");
            }
        });
//        lambda��ʽ����
        make(()->{
            System.out.println("��ʦ����");
        });
    }
    public static void make(Myinterface cookmethods){
        cookmethods.cook();
    }
}
