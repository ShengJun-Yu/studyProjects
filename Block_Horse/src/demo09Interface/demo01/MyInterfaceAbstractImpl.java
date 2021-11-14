package demo09Interface.demo01;



/**
 * @author : Bojack
 * @date : Created in 20:24 2021.11.09
 */
public class MyInterfaceAbstractImpl implements MyInterfaceAbstract {
    @Override
    public void methodAbs() {
        System.out.println("这是第一个接口方法");
    }

    @Override
    public void methodAbs1() {
        System.out.println("这是第二个接口方法");
    }

    @Override
    public void methodAbs2() {
        System.out.println("这是第三个接口方法");
    }

    @Override
    public void methodAbs3() {
        System.out.println("这是第四个接口方法");
    }
}
