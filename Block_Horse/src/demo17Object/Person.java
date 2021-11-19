package demo17Object;

import java.util.Objects;

/**
 * @author : Bojack
 * @date : Created in 19:57 2021.11.19
 */
public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*
        Object���equals����,Ĭ�ϱȽϵ�����������ĵ�ֵַ,û������
        ��������Ҫ��дequals����,�Ƚ��������������(name,age)
        ����:
            ������һ����̬
            ��̬�ı׶�:�޷�ʹ���������е�����(���Ժͷ���)
            Object obj = p2 = new Person("��������",19);
            ���:����ʹ������ת��(ǿת)��obj����ת��ΪPerson
     */
//    @Override
//    public boolean equals(Object o) {
//        //�жϴ��ݵĲ���o�����null,ֱ�ӷ���false,��߳����Ч��
//        if (o == null) {
//            return false;
//        }
//        //�жϴ��ݲ���o������Լ���ֱ�ӷ���false,��߳����Ч��
//        if (o == this) {
//            return true;
//        }
//        if (o instanceof Person) {
//            Person p = (Person) o;//����ת��Ϊ����Person
//            boolean b = p.equals(this.name) && ((Person) o).age == this.age;
//            return b;
//        }
//        return false;
//    }
        @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        //getClass() != o.getClass() ʹ�÷��似��,�ж�o�Ƿ���Person����  ��Ч�� obj instanceof Person
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {//������дtoString����
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
