package 方法;

/**
 * @author : Bojack
 * @date : 2021年10月10日17:17:57
 * 构造方法是专门为了创建对象的方法，当通过new创建对象时就在调用 构造方法
 * public 类名（变量类型 变量名）{
 * 方法体
 * }
 * 注意事项：
 * 1. 构造方法的名称必须和所在的类名称完全一样，就连大小写也要一样
 * 2. 构造方法不要写返回值类型，连void都不写
 * 3. 构造方法不能return一个具体的返回值
 * 4. 如果没有编写任何构造方法，那么编译器将会默认赠送一个构造方法，没有参数、方法体什么事情都不做。
 * public Student() {}
 * 5. 一旦编写了至少一个构造方法，那么编译器将不再赠送。
 * 6. 构造方法也是可以进行重载的。
 * 重载：方法名称相同，参数列表不同。
 */
public class 构造方法 {
    // 成员变量
    private String name;
    private int age;

    // 无参数的构造方法
    public 构造方法() {
        System.out.println("无参构造方法正在执行！");
    }

    // 全参数的构造方法
    public 构造方法(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("全参构造方法正在运行");
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
