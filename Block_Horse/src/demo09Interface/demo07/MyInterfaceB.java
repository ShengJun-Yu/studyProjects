package demo09Interface.demo07;

/**
 * @author : Bojack
 * @date : Created in 9:20 2021.11.12
 */
public interface MyInterfaceB {
    // 错误写法！接口不能有静态代码块
//    static {
//
//    }

    // 错误写法！接口不能有构造方法
//    public MyInterfaceA() {
//
//    }
    public abstract void methodB();
    public abstract void methodComment();
    public default void methodDefault(){
        System.out.println("默认方法BB");
    }
}
