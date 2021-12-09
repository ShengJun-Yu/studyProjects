package demo34Thread.ThreadClassMain;

/**
 * @author : Bojack
 * @date : Created in 21:24 2021.12.09
 *    获取线程的名称:
 *         1.使用Thread类中的方法getName()
 *             String getName() 返回该线程的名称。
 *         2.可以先获取到当前正在执行的线程,使用线程中的方法getName()获取线程的名称
 *             static Thread currentThread() 返回对当前正在执行的线程对象的引用。
 */
public class demo01GetnameAndCurrentThread {
    public static void main(String[] args) {
        Person p=new Person();
        p.start();
        new Person().start();
        new Person().start();
        System.out.println(Thread.currentThread().getName());
    }
}
