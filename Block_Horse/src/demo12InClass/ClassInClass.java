package demo12InClass;

/**
 * @author : Bojack
 * @date : Created in 21:08 2021.11.16
 * ���һ��������ڲ�������һ�������ô�����һ�����ڲ�������һ���ࡣ
 * ���磺���������Ĺ�ϵ�����磺�����ͷ������Ĺ�ϵ��
 * <p>
 * ���ࣺ
 * 1. ��Ա�ڲ���
 * 2. �ֲ��ڲ��ࣨ���������ڲ��ࣩ
 * <p>
 * ��Ա�ڲ���Ķ����ʽ��
 * ���η� class �ⲿ������ {
 * ���η� class �ڲ������� {
 * // ...
 * }
 * // ...
 * }
 * <p>
 * ע�⣺�����⣬������ʣ������ڣ���Ҫ�ڲ������
 */
public class ClassInClass {//�ⲿ��
    String num="�ⲿ��";
    public class clas {//�ڲ���
        String num="�ڲ���";
        public void methods() {
            String num="�ڲ��෽������";
            System.out.println("�ڲ��෽��");
            System.out.println(name);
            // �������������������ô��ʽ�ǣ��ⲿ������.this.�ⲿ���Ա������
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(ClassInClass.this.num);
        }
    }

    public void method() {
        System.out.println("�ⲿ�෽��");
        new clas().methods();

    }

    private String name = "Jun";

    public ClassInClass() {
    }

    public ClassInClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
