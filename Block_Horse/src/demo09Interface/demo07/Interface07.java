package demo09Interface.demo07;

/**
 * @author : Bojack
 * @date : Created in 9:19 2021.11.12
 * ʹ�ýӿڵ�ʱ����Ҫע�⣺
 *
 * 1. �ӿ���û�о�̬�������߹��췽���ġ�
 * 2. һ�����ֱ�Ӹ�����Ψһ�ģ�����һ�������ͬʱʵ�ֶ���ӿڡ�
 * ��ʽ��
 * public class MyInterfaceImpl implements MyInterfaceA, MyInterfaceB {
 *     // ������д���г��󷽷�
 * }
 * 3. ���ʵ������ʵ�ֵĶ���ӿڵ��У������ظ��ĳ��󷽷�����ôֻ��Ҫ������дһ�μ��ɡ�
 * 4. ���ʵ����û�и�����д���нӿڵ��е����г��󷽷�����ôʵ����ͱ�����һ�������ࡣ
 * 5. ���ʵ������ʵ�ֵĶ���ӿڵ��У������ظ���Ĭ�Ϸ�������ôʵ����һ��Ҫ�Գ�ͻ��Ĭ�Ϸ������и�����д��
 * 6. һ�������ֱ�Ӹ��൱�еķ������ͽӿڵ��е�Ĭ�Ϸ��������˳�ͻ�������ø��൱�еķ�����
 */
public class Interface07 {
    public static void main(String[] args) {
        MyInterfaceImpl impl=new MyInterfaceImpl();
        impl.methodA();
        impl.methodB();
        impl.methodComment();
        impl.methodDefault();
        System.out.println("=================");
        Son son =new Son();
        son.method();

    }
}
