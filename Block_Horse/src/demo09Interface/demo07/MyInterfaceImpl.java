package demo09Interface.demo07;

/**
 * @author : Bojack
 * @date : Created in 9:23 2021.11.12
 */
//һ�����ֱ�Ӹ�����Ψһ�ģ�����һ�������ͬʱʵ�ֶ���ӿڡ�
public class MyInterfaceImpl implements MyInterfaceA,MyInterfaceB{
    @Override
    public void methodA() {
        System.out.println("������дA");
    }
    @Override
    public void methodB() {
        System.out.println("������дB");
    }
//    ���ʵ������ʵ�ֵĶ���ӿڵ��У������ظ��ĳ��󷽷�����ôֻ��Ҫ������дһ�μ��ɡ�
    @Override
    public void methodComment() {
        System.out.println("������д��AB���еķ���Comment");
    }
//    ���ʵ������ʵ�ֵĶ���ӿڵ��У������ظ���Ĭ�Ϸ�������ôʵ����һ��Ҫ�Գ�ͻ��Ĭ�Ϸ������и�����д��

    @Override
    public void methodDefault() {
        System.out.println("������д��AB�ӿ����ظ���methodDefault����");
    }
}
