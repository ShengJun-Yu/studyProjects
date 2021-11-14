package demo10Class;

/**
 * @author : Bojack
 * @date :2021年10月4日16:36:14
 * 通常情况下，一个类无法直接使用，需要根据类创建一个对象才能使用
 * <p>
 * 1. 导包：也就是指出需要使用的类，在什么位置。
 * import 包名称.类名称;
 * import 面向对象.类.Student;
 * 对于和当前类属于同一个包的情况，可以省略导包语句不写。(此处即可不写)
 * <p>
 * 2. 创建，格式：
 * 类名称 对象名 = new 类名称();
 * Student stu = new Student();
 * <p>
 * 3. 使用，分为两种情况：
 * 使用成员变量：对象名.成员变量名
 * 使用成员方法：对象名.成员方法名(参数)
 * （也就是，想用谁，就用对象名点儿谁。）
 * <p>
 * 注意事项：
 * 如果成员变量没有进行赋值，那么将会有一个默认值，规则和数组一样。
 */
public class Student导入 {
    public static void main(String[] args) {
        //类名称 对象名 = new 类名称();
        Student stu = new Student();
        System.out.println(stu.name);//默认为null
        System.out.println(stu.age);//默认为0

        stu.name = "余盛军";
        stu.age = 18;
        System.out.println(stu.name);//默认为null
        System.out.println(stu.age);//默认为0

        // 对象名.成员方法名(参数)
        stu.study();
        stu.eat();
        stu.sleep();
    }
}
