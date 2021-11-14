package demo09Interface.demo07;

/**
 * @author : Bojack
 * @date : Created in 9:53 2021.11.12
 */
public interface MyInterface {
    public default void method(){
        System.out.println("接口默认方法");
    }
}
