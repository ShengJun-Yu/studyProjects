package demo34Thread;

import demo34Thread.IntefaceThread.RunnableImpl;

/**
 * @author : Bojack
 * @date : Created in 19:48 2021.12.11
 * 匿名内部类方式实现线程的创建
 * <p>
 * 匿名:没有名字
 * 内部类:写在其他类内部的类
 * <p>
 * 匿名内部类作用:简化代码
 * 把子类继承父类,重写父类的方法,创建子类对象合一步完成
 * 把实现类实现类接口,重写接口中的方法,创建实现类对象合成一步完成
 * 匿名内部类的最终产物:子类/实现类对象,而这个类没有名字
 * <p>
 * 格式:
 * new 父类/接口(){
 * 重复父类/接口中的方法
 * };
 */
public class AnonyThread {
    public static void main(String[] args) {
//        匿名内部类实现多线程
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "匿名内部类==>" + i);
                }
            }
        }.start();
//        lambda表达式写法
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "lambda匿名内部类==>");
        }).start();

//        省略版lambda表达式写法
        new Thread(() ->System.out.println(Thread.currentThread().getName() + "省略版lambda匿名内部类==>")).start();

//        匿名接口实现多线程
        Runnable r = new RunnableImpl() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "匿名接口==>" + i);
                }
            }
        };
        new Thread(r).start();
//        简洁写法
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "简洁接口==>" + i);
                }
            }
        }).start();
    }


}
