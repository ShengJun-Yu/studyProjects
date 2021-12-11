package demo34Thread.ThreadClassMain;

/**
 * @author : Bojack
 * @date : Created in 21:24 2021.12.09
 * 获取线程的名称:
 * 1.使用Thread类中的方法getName()
 * String getName() 返回该线程的名称。
 * 2.可以先获取到当前正在执行的线程,使用线程中的方法getName()获取线程的名称
 * static Thread currentThread() 返回对当前正在执行的线程对象的引用。
 * <p>
 * 设置线程的名称:(了解)
 * 1.使用Thread类中的方法setName(名字)
 * void setName(String name) 改变线程名称，使之与参数 name 相同。
 * 2.创建一个带参数的构造方法,参数传递线程的名称;调用父类的带参构造方法,把线程名称传递给父类,让父类(Thread)给子线程起一个名字
 * Thread(String name) 分配新的 Thread 对象。
 */
public class demo01GetnameAndCurrentThread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Person p = new Person();
        p.start();
        Person p1 = new Person();
        p1.setName("jun");
        p1.start();
        new Person("junThreads").start();

    }
}
