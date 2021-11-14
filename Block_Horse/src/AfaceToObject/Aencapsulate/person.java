package AfaceToObject.Aencapsulate;

/**
 * @author : Bojack
 * @date : 2021年10月9日20:36:12
 * 问题描述：定义Person的年龄时，无法阻止不合理的数值被设置进来。
 * 解决方案：用private关键字将需要保护的成员变量进行修饰。
 * <p>
 * 一旦使用了private进行修饰，那么本类当中仍然可以随意访问。
 * 但是！超出了本类范围之外就不能再直接访问了。
 * <p>
 * 间接访问private成员变量，就是定义一对儿Getter/Setter方法
 * <p>
 * 必须叫setXxx或者是getXxx命名规则。
 * 对于Getter来说，不能有参数，返回值类型和成员变量对应；
 * 对于Setter来说，不能有返回值，参数类型和成员变量对应。
 */
public class person {
    private int age;
    String name;

    public void show() {
        System.out.println("我叫" + name + ",我" + age + "岁了！");
    }

    //用于向age设置数据
    public void setAge(int num) {
        if (num < 130 && num > 0) {
            age = num;
        } else {
            System.out.println("错误年龄数据");
        }
    }

    //用于获取age数据
    public int getAge() {
        return age;
    }
}
