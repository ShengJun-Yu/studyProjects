package demo09Interface.demo08;

/**
 * @author : Bojack
 * @date : Created in 20:12 2021.11.12
 * 1. ������֮���ǵ��̳еġ�ֱ�Ӹ���ֻ��һ����
 * 2. ����ӿ�֮���Ƕ�ʵ�ֵġ�һ�������ʵ�ֶ���ӿڡ�
 * 3. �ӿ���ӿ�֮���Ƕ�̳еġ�
 *
 * ע�����
 * 1. ������ӿڵ��еĳ��󷽷�����ظ���û��ϵ��
 * 2. ������ӿڵ��е�Ĭ�Ϸ�������ظ�����ô�ӽӿڱ������Ĭ�Ϸ����ĸ�����д�������Ҵ���default�ؼ��֡���
 */
public class MyInterface08 {
    public static void main(String[] args) {
        MyInterfaceImpl impl=new MyInterfaceImpl();
         impl.methodA();
        impl.methodB();
        impl.methodComment();
        impl.methodDefault();
        MyInterface.methodStatic();
    }


}
