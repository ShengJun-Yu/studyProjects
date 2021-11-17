package demo12InClass;

/**
 * @author : Bojack
 * @date : Created in 21:08 2021.11.16
 * 如果一个事物的内部包含另一个事物，那么这就是一个类内部包含另一个类。
 * 例如：身体和心脏的关系。又如：汽车和发动机的关系。
 * <p>
 * 分类：
 * 1. 成员内部类
 * 2. 局部内部类（包含匿名内部类）
 * <p>
 * 成员内部类的定义格式：
 * 修饰符 class 外部类名称 {
 * 修饰符 class 内部类名称 {
 * // ...
 * }
 * // ...
 * }
 * <p>
 * 注意：内用外，随意访问；外用内，需要内部类对象。
 */
public class ClassInClass {//外部类
    String num="外部类";
    public class clas {//内部类
        String num="内部类";
        public void methods() {
            String num="内部类方法变量";
            System.out.println("内部类方法");
            System.out.println(name);
            // 如果出现了重名现象，那么格式是：外部类名称.this.外部类成员变量名
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(ClassInClass.this.num);
        }
    }

    public void method() {
        System.out.println("外部类方法");
        new clas().methods();

    }

    private String name = "Jun";

    public ClassInClass() {
    }

    public ClassInClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
