package demo09Interface.demo08;

/**
 * @author : Bojack
 * @date : Created in 20:14 2021.11.12
 */
public interface MyInterface extends MyInterfaceA,MyInterfaceB {
    @Override
    public default void methodDefault() {
        System.out.println("覆盖重写默认方法AB");
    }
    public static void methodStatic(){
        System.out.println("静态方法");
    }
}
