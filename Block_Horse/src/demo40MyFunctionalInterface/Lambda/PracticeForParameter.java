package demo40MyFunctionalInterface.Lambda;

/**
 * @author : Bojack
 * @date : Created in 19:49 2022.02.27
 * 例如java.lang.Runnable接口就是一个函数式接口，
 * 假设有一个startThread方法使用该接口作为参数，那么就可以使用Lambda进行传参。
 * 这种情况其实和Thread类的构造方法参数为Runnable没有本质区别。
 */
public class PracticeForParameter {
    public static void startThread(Runnable r) {
        new Thread(r).start();
    }

    public static void main(String[] args) {
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"-->启动");
            }
        });
        //lambda表达式
        startThread(()->{
            System.out.println(Thread.currentThread().getName()+"-->启动");
        });
    }
}
