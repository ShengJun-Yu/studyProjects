package demo09Interface.demo04;

import demo09Interface.demo03.MyInterfaceStatic;

/**
 * @author : Bojack
 * @date : Created in 21:53 2021.11.09
 */
public class Interface04 {
    public static void main(String[] args) {
        MyInterfacePrivateImpl impl = new MyInterfacePrivateImpl();
        impl.methodA();
        impl.methodB();
    }
}
