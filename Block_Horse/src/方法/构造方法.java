package ����;

/**
 * @author : Bojack
 * @date : 2021��10��10��17:17:57
 * ���췽����ר��Ϊ�˴�������ķ�������ͨ��new��������ʱ���ڵ��� ���췽��
 * public �������������� ��������{
 * ������
 * }
 * ע�����
 * 1. ���췽�������Ʊ�������ڵ���������ȫһ����������СдҲҪһ��
 * 2. ���췽����Ҫд����ֵ���ͣ���void����д
 * 3. ���췽������returnһ������ķ���ֵ
 * 4. ���û�б�д�κι��췽������ô����������Ĭ������һ�����췽����û�в�����������ʲô���鶼������
 * public Student() {}
 * 5. һ����д������һ�����췽������ô���������������͡�
 * 6. ���췽��Ҳ�ǿ��Խ������صġ�
 * ���أ�����������ͬ�������б�ͬ��
 */
public class ���췽�� {
    // ��Ա����
    private String name;
    private int age;

    // �޲����Ĺ��췽��
    public ���췽��() {
        System.out.println("�޲ι��췽������ִ�У�");
    }

    // ȫ�����Ĺ��췽��
    public ���췽��(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("ȫ�ι��췽����������");
    }

    // Getter Setter
    public void getName(String name) {
        this.name = name;
    }

    public String setName() {
        return name;
    }

    public void getAge(int age) {
        this.age = age;
    }

    public int setAge() {
        return age;
    }

}
