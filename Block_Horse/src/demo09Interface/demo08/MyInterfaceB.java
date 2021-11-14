package demo09Interface.demo08;

/**
 * @author : Bojack
 * @date : Created in 20:13 2021.11.12
 */
public interface MyInterfaceB {
    public abstract void methodB();
    public abstract void methodComment();
    public default void methodDefault(){
        System.out.println("Ä¬ÈÏ·½·¨A");
    }
}
