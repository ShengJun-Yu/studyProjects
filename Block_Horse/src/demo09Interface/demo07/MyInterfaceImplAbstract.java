package demo09Interface.demo07;

/**
 * @author : Bojack
 * @date : Created in 9:23 2021.11.12
 */
//һ�����ֱ�Ӹ�����Ψһ�ģ�����һ�������ͬʱʵ�ֶ���ӿڡ�
//    ���ʵ����û�и�����д���нӿڵ��е����г��󷽷�����ôʵ����ͱ�����һ�������ࡣ
public abstract class MyInterfaceImplAbstract implements MyInterfaceA,MyInterfaceB{
    @Override
    public void methodA() {
        System.out.println("������дA");
    }


//    ���ʵ������ʵ�ֵĶ���ӿڵ��У������ظ��ĳ��󷽷�����ôֻ��Ҫ������дһ�μ��ɡ�
    @Override
    public void methodComment() {
        System.out.println("������д��AB���еķ���Comment");
    }

    @Override
    public void methodDefault() {
        System.out.println("������д��AB�ӿ����ظ���methodDefault����");
    }
}
