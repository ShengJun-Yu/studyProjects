package demo04ArrayList;

/**
 * @author : Bojack
 * @date : 2021��10��13��19:00:13
 * ��Ŀ��
 * ����һ�����飬�����洢3��Person����
 * <p>
 * ������һ��ȱ�㣺һ�����������������ڼ䳤�Ȳ����Է����ı�
 */
public class ObjectArray {
    public static void main(String[] args) {
        //����һ��Person����3Ԫ�ص�����
        Person[] array = new Person[3];

        //��Ҫ����Ĳ�������Person����
        Person zero = new Person("Stephen", 18);
        Person one = new Person("Bojack", 28);
        Person two = new Person("Cete", 38);

        //��ִ����ķ�������ĵ�ֵַ���浽����֮��
        array[0] = zero;
        array[1] = one;
        array[2] = two;

//        System.out.println(array[0]);
//        System.out.println(array[1]);
//        System.out.println(array[2]);

        System.out.println("�ҽ�" + array[0].getName() + "�ҵ�������" + array[0].getAge());
        System.out.println("�ҽ�" + array[1].getName() + "�ҵ�������" + array[1].getAge());
        System.out.println("�ҽ�" + array[2].getName() + "�ҵ�������" + array[2].getAge());
    }

}
