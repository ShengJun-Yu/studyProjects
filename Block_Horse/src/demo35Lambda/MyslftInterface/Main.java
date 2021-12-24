package demo35Lambda.MyslftInterface;

/**
 * @author : Bojack
 * @date : Created in 21:25 2021.12.13
 */
public class Main {
    public static void main(String[] args) {
//        面向对象传统方式
        MyinterfaceImpl impl=new MyinterfaceImpl();
        impl.cook();

//        匿名内部类方式
        make(new Myinterface() {
            @Override
            public void cook() {
                System.out.println("厨师做饭");
            }
        });
//        lambda方式编码
        make(()->{
            System.out.println("厨师做饭");
        });
    }
    public static void make(Myinterface cookmethods){
        cookmethods.cook();
    }
}
