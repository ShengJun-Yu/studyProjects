package demo09Interface.demo05;

/**
 * @author : Bojack
 * @date : Created in 22:07 2021.11.09
 * 2. 静态私有方法，解决多个静态方法之间重复代码问题
 * 格式：
 * private static 返回值类型 方法名称(参数列表) {
 * 方法体
 * }
 */
public interface MyInterfacePrivateStatic {
    public static void methodA() {
        System.out.println("静态方法A");
        methodComment();
    }

    public static void methodB() {
        System.out.println("静态方法B");
        methodComment();
    }

    private static void methodComment() {
        System.out.println("AAAA");
        System.out.println("BBBB");
    }
}
