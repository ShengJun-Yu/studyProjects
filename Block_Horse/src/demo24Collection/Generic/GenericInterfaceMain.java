package demo24Collection.Generic;

/**
 * @author : Bojack
 * @date : Created in 21:34 2021.11.30
 * �����͵Ľӿڲ���
 */
public class GenericInterfaceMain {
    public static void main(String[] args) {
        //����GenericInterfaceImpl01
        GenericInterfaceImpl01 impl01=new GenericInterfaceImpl01();
        impl01.method("edw");
        //����GenericInterfaceImpl2���� ��ֻ��ָ����������
        GenericInterfaceImpl02<Integer> impl02=new GenericInterfaceImpl02<>();
        impl02.method(123);

        GenericInterfaceImpl02<String> impl03=new GenericInterfaceImpl02<>();
        impl02.method("JUN");


    }


}
