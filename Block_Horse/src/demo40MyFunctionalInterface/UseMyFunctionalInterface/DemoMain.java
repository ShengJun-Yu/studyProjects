package demo40MyFunctionalInterface.UseMyFunctionalInterface;

/**
 * @author : Bojack
 * @date : Created in 18:45 2022.02.27
 * 函数式接口的使用:一般可以作为方法的参数和返回值类型
 */
public class DemoMain {
    //定义一个方法传入参数为函数式接口
    public static void show(MyFunctionalInterface mfi) {
        mfi.method();
    }


    public static void main(String[] args) {
    //调用show方法,方法的参数是一个接口,所以可以传递接口的实现类对象
        show(new MyFunctionalInterfaceImpl());
    //调用show方法,方法的参数是一个接口,所以我们可以传递接口的匿名内部类
        show(new MyFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类重写接口中的抽象方法");
            }
        });
    //lamnda表达式实现
    show(()->{
        System.out.println("lambda表达式实现");
    });
    //简化版
        show(()-> System.out.println("lambda表达式简化版"));
    }

}
