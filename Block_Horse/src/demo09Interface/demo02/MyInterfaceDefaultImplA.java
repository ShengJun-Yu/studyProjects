package demo09Interface.demo02;

/**
 * @author : Bojack
 * @date : Created in 21:17 2021.11.09
 */
public class MyInterfaceDefaultImplA implements MyInterfaceDefault{
    @Override
    public void methodsAbs() {
        System.out.println("抽象方法A");
    }
    @Override
    public void methodDefault(){
        System.out.println("抽象方法A覆盖重写了接口默认方法");
    }
}
