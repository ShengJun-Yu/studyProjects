package demo09Interface.demo02;

/**
 * @author : Bojack
 * @date : Created in 21:13 2021.11.09
 * 1. �ӿڵ�Ĭ�Ϸ���������ͨ���ӿ�ʵ�������ֱ�ӵ��á�
 * 2. �ӿڵ�Ĭ�Ϸ�����Ҳ���Ա��ӿ�ʵ������и�����д��
 */
public class Interface02 {
    public static void main(String[] args) {
        MyInterfaceDefaultImplA a = new MyInterfaceDefaultImplA();
        a.methodsAbs();
        a.methodDefault();

        MyInterfaceDefaultImplB b = new MyInterfaceDefaultImplB();
        b.methodsAbs();
        b.methodDefault();

    }
}
