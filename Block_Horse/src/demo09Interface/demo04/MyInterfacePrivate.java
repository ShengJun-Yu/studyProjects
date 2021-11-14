package demo09Interface.demo04;

/**
 * @author : Bojack
 * @date : Created in 21:54 2021.11.09
 * 问题描述：
 * 我们需要抽取一个共有方法，用来解决两个默认方法之间重复代码的问题。
 * 但是这个共有方法不应该让实现类使用，应该是私有化的。
 * <p>
 * 解决方案：
 * 从Java 9开始，接口当中允许定义私有方法。
 * 1. 普通私有方法，解决多个默认方法之间重复代码问题
 * 格式：
 * private 返回值类型 方法名称(参数列表) {
 * 方法体
 * }
 */
public interface MyInterfacePrivate {
    public default void methodA() {
        System.out.println("方法A");
        methodComment();
    }

    public default void methodB() {
        System.out.println("方法B");
        methodComment();
    }

    private void methodComment() {
        System.out.println("AAAA");
        System.out.println("BBBB");
    }

}
