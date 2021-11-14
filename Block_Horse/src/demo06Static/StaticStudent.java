package demo06Static;

/**
 * @author : Bojack
 * @date : 2021年10月18日21:31:03
 */
public class StaticStudent {

    public static void main(String[] args) {
        // 首先设置一下教室，这是静态的东西，应该通过类名称进行调用
        StaticField.room = "101教室";

        StaticField one = new StaticField("郭靖", 20);
        System.out.println("one的姓名：" + one.getName());
        System.out.println("one的年龄：" + one.getAge());
        System.out.println("one的教室：" + StaticField.room);
        System.out.println("============");

        StaticField two = new StaticField("黄蓉", 18);
        System.out.println("two的姓名：" + two.getName());
        System.out.println("two的年龄：" + two.getAge());
        System.out.println("two的教室：" + StaticField.room);
    }

}


