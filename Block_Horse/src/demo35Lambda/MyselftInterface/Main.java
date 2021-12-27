package demo35Lambda.MyselftInterface;

/**
 * @author : Bojack
 * @date : Created in 21:25 2021.12.13
 */
public class Main {
    public static void main(String[] args) {
//        面向对象传统方式
        MyinterfaceImpl impl=new MyinterfaceImpl();
        System.out.println("传统方法：");
        impl.cook();

//        匿名内部类方式
        System.out.println("匿名内部类方法：");
        make(new Myinterface() {
            @Override
            public void cook() {
                System.out.println("厨师做饭");
            }
        });
//        lambda方式编码
        System.out.println("lambda方法：");
        make(()-> System.out.println("厨师做饭"));
    }
    public static void make(Myinterface cookmethods){
        cookmethods.cook();
    }
}
