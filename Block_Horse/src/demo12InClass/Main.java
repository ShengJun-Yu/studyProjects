package demo12InClass;

/**
 * @author : Bojack
 * @date : Created in 21:18 2021.11.16
 * 1. ��ӷ�ʽ�����ⲿ��ķ������У�ʹ���ڲ��ࣻȻ��mainֻ�ǵ����ⲿ��ķ�����
 * 2. ֱ�ӷ�ʽ����ʽ��
 * ������ ������ = new ������();
 * ���ⲿ������.�ڲ������� ������ = new �ⲿ������().new �ڲ�������();��
 */
public class Main {
    public static void main(String[] args) {
        ClassInClass cla=new ClassInClass();
        cla.method();// ͨ���ⲿ��Ķ��󣬵����ⲿ��ķ�������������ʹ���ڲ���methods
        System.out.println("===============");
//ֱ��   �ⲿ������.�ڲ������� ������ = new �ⲿ������().new �ڲ�������();
        ClassInClass.clas sp=new ClassInClass().new clas();
        sp.methods();
        System.out.println("======================");
        ClassInMain inmain=new ClassInMain();
        inmain.ClassMethod();
    }
}
