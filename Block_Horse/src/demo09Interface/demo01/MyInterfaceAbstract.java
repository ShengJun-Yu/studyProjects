package demo09Interface.demo01;

/**
 * @author : Bojack
 * @date : Created in 20:13 2021.11.09
 *  接口就是多个类的公共规范。
 *  接口是一种引用数据类型，最重要的内容就是其中的：抽象方法。
 *
 *  如何定义一个接口的格式：
 *  public interface 接口名称 {
 *      // 接口内容
 *  }
 *
 *  备注：换成了关键字interface之后，编译生成的字节码文件仍然是：.java --> .class。
 *
 *  如果是Java 7，那么接口中可以包含的内容有：
 *  1. 常量
 *  2. 抽象方法
 *
 *  如果是Java 8，还可以额外包含有：
 *  3. 默认方法
 *  4. 静态方法
 *
 *  如果是Java 9，还可以额外包含有：
 *  5. 私有方法
 * 在任何版本的Java中，接口都能定义抽象方法。
 * 格式：
 * public abstract 返回值类型 方法名称(参数列表);
 * <p>
 * 注意事项：
 * 1. 接口当中的抽象方法，修饰符必须是两个固定的关键字：public abstract
 * 2. 这两个关键字修饰符，可以选择性地省略。（今天刚学，所以不推荐。）
 * 3. 方法的三要素，可以随意定义。
 */
public interface MyInterfaceAbstract {
    public abstract void methodAbs();

    abstract void methodAbs1();

    public void methodAbs2();

    void methodAbs3();

}
