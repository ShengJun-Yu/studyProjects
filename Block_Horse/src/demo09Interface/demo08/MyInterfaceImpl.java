package demo09Interface.demo08;

/**
 * @author : Bojack
 * @date : Created in 20:16 2021.11.12
 */
public class MyInterfaceImpl implements MyInterface{
    @Override
    public void methodA() {
        System.out.println("������дA");
    }

    @Override
    public void methodB() {
        System.out.println("������дB");
    }

    @Override
    public void methodComment() {
        System.out.println("������дAB");
    }
}
