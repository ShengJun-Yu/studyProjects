package demo09Interface.demo08;

/**
 * @author : Bojack
 * @date : Created in 20:12 2021.11.12
 */
public interface MyInterfaceA {
    public abstract void methodA();
    public abstract void methodComment();
    public default void methodDefault(){
        System.out.println("Ä¬ÈÏ·½·¨A");
    }
}
