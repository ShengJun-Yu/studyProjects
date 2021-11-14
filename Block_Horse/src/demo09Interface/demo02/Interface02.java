package demo09Interface.demo02;

/**
 * @author : Bojack
 * @date : Created in 21:13 2021.11.09
 * 1. 接口的默认方法，可以通过接口实现类对象，直接调用。
 * 2. 接口的默认方法，也可以被接口实现类进行覆盖重写。
 */
public class Interface02 {
    public static void main(String[] args) {
        MyInterfaceDefaultImplA a = new MyInterfaceDefaultImplA();
        a.methodsAbs();
        a.methodDefault();

        MyInterfaceDefaultImplB b = new MyInterfaceDefaultImplB();
        b.methodsAbs();
        b.methodDefault();

    }
}
