package demo38IOStream.ObjectStream;

import java.io.Serializable;

/**
 * @author : Bojack
 * @date : Created in 15:07 2022.02.21
 * ���л��ͷ����л���ʱ��,���׳�NotSerializableExceptionû�����л��쳣
 *     ��ͨ��ʵ�� java.io.Serializable �ӿ������������л����ܡ�δʵ�ִ˽ӿڵ��ཫ�޷�ʹ���κ�״̬���л������л���
 *     Serializable�ӿ�Ҳ�б���ͽӿ�
 *         Ҫ�������л��ͷ����л��������ʵ��Serializable�ӿ�,�ͻ�������һ�����
 *         �����ǽ������л��ͷ����л���ʱ��,�ͻ��������Ƿ���������
 *             ��:�Ϳ������л��ͷ����л�
 *             û��:�ͻ��׳� NotSerializableException�쳣
 *     ȥ�г�����-->������һ����ɫ��(���ϸ�)-->���Ĺ���-->�������ô������
 *
 *
 *     static�ؼ���:��̬�ؼ���
 *         ��̬�����ڷǾ�̬���ص��ڴ���(��̬�����ڶ�����뵽�ڴ���)
 *         ��static���εĳ�Ա�������ܱ����л���,���л��Ķ��Ƕ���
 *         private static int age;
 *         oos.writeObject(new Person("С��Ů",18));
 *         Object o = ois.readObject();
 *         Person{name='С��Ů', age=0}
 *
 *     transient�ؼ���:˲̬�ؼ���
 *         ��transient���γ�Ա����,���ܱ����л�
 *         private transient int age;
 *         oos.writeObject(new Person("С��Ů",18));
 *         Object o = ois.readObject();
 *         Person{name='С��Ů', age=0}
 */
public class Person implements Serializable {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
