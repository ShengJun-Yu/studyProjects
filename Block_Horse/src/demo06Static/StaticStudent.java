package demo06Static;

/**
 * @author : Bojack
 * @date : 2021��10��18��21:31:03
 */
public class StaticStudent {

    public static void main(String[] args) {
        // ��������һ�½��ң����Ǿ�̬�Ķ�����Ӧ��ͨ�������ƽ��е���
        StaticField.room = "101����";

        StaticField one = new StaticField("����", 20);
        System.out.println("one��������" + one.getName());
        System.out.println("one�����䣺" + one.getAge());
        System.out.println("one�Ľ��ң�" + StaticField.room);
        System.out.println("============");

        StaticField two = new StaticField("����", 18);
        System.out.println("two��������" + two.getName());
        System.out.println("two�����䣺" + two.getAge());
        System.out.println("two�Ľ��ң�" + StaticField.room);
    }

}


