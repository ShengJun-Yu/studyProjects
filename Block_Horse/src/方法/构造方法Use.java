package 方法;

/**
 * @author : Bojack
 * @date : 2021年10月10日17:19:21
 */
public class 构造方法Use {
    public static void main(String[] args) {
        构造方法 stu = new 构造方法();
        构造方法 stu1 = new 构造方法("stephen", 18);
        System.out.println("我是" + stu1.setName() + "我" + stu1.setAge() + "岁了！");
        stu1.getAge(19);
        System.out.println("我是" + stu1.setName() + "我" + stu1.setAge() + "岁了！");


    }
}
