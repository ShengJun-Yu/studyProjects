package demo13AnonymousInClass;

/**
 * @author : Bojack
 * @date : Created in 19:36 2021.11.17
 * ����ӿڵ�ʵ���ࣨ�����Ǹ�������ֻࣩ��Ҫʹ��Ψһ��һ�Σ�
 * ��ô��������¾Ϳ���ʡ�Ե�����Ķ��壬����Ϊʹ�á������ڲ��ࡿ��
 *
 * �����ڲ���Ķ����ʽ��
 * �ӿ����� ������ = new �ӿ�����() {
 *     // ������д���г��󷽷�
 * };
 *
 * �Ը�ʽ��new �ӿ�����() {...}�����н�����
 * 1. new����������Ķ���
 * 2. �ӿ����ƾ��������ڲ�����Ҫʵ���ĸ��ӿ�
 * 3. {...}����������ڲ��������
 *
 * ���⻹Ҫע�⼸�����⣺
 * 1. �����ڲ��࣬�ڡ��������󡿵�ʱ��ֻ��ʹ��Ψһһ�Ρ�
 * ���ϣ����δ������󣬶����������һ���Ļ�����ô����Ҫʹ�õ��������ʵ�����ˡ�
 * 2. ���������ڡ����÷�������ʱ��ֻ�ܵ���Ψһһ�Ρ�
 * ���ϣ��ͬһ�����󣬵��ö�η�������ô���������������֡�
 * 3. �����ڲ�����ʡ���ˡ�ʵ����/�������ơ�����������������ʡ���ˡ��������ơ�
 * ǿ���������ڲ��������������һ���£�����
 */
public class AnoonymousMain {
    public static void main(String[] args) {
        MyInterface inter =new MyInterface() {
            @Override
            public void method1() {
                System.out.println("ʹ�����������า����д�ӿڷ���1");
            }

            @Override
            public void method2() {
                System.out.println("ʹ�����������า����д�ӿڷ���2");
            }
        };
        inter.method1();
        inter.method2();
        System.out.println("===========================");
        new MyInterface() {
            @Override
            public void method1() {
                System.out.println("ʹ��������������������า����д�ӿڷ���2");
            }

            @Override
            public void method2() {
                System.out.println("ʹ��������������������า����д�ӿڷ���2");
            }
        }.method1();
        new MyInterface() {
            @Override
            public void method1() {
                System.out.println("ʹ��������������������า����д�ӿڷ���2");
            }

            @Override
            public void method2() {
                System.out.println("ʹ��������������������า����д�ӿڷ���2");
            }
        }.method2();



    }
}
