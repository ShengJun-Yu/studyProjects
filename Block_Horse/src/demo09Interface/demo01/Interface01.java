package demo09Interface.demo01;

/**
 * @author : Bojack
 * @date : Created in 20:12 2021.11.09
 * �ӿ�ʹ�ò��裺
 * 1. �ӿڲ���ֱ��ʹ�ã�������һ����ʵ���ࡱ����ʵ�֡��ýӿڡ�
 * ��ʽ��
 * public class ʵ�������� implements �ӿ����� {
 *     // ...
 * }
 * 2. �ӿڵ�ʵ������븲����д��ʵ�֣��ӿ������еĳ��󷽷���
 * ʵ�֣�ȥ��abstract�ؼ��֣����Ϸ���������š�
 * 3. ����ʵ����Ķ��󣬽���ʹ�á�
 *
 * ע�����
 * ���ʵ���ಢû�и�����д�ӿ������еĳ��󷽷�����ô���ʵ�����Լ��ͱ����ǳ����ࡣ
 */
public class Interface01 {
    public static void main(String[] args) {
        MyInterfaceAbstractImpl impl=new MyInterfaceAbstractImpl();
        impl.methodAbs();
        impl.methodAbs1();
        impl.methodAbs2();
        impl.methodAbs3();
    }
}
