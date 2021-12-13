package demo35Lambda;

/**
 * @author : Bojack
 * @date : Created in 21:06 2021.12.13
 *     Lambda表达式的标准格式:
 *         由三部分组成:
 *             a.一些参数
 *             b.一个箭头
 *             c.一段代码
 *         格式:
 *             (参数列表) -> {一些重写方法的代码};
 *         解释说明格式:
 *             ():接口中抽象方法的参数列表,没有参数,就空着;有参数就写出参数,多个参数使用逗号分隔
 *             ->:传递的意思,把参数传递给方法体{}
 *             {}:重写接口的抽象方法的方法体
 */
public class ThreadLambda {
    public static void main(String[] args) {
//        面向对象编程，直接使用匿名接口实现多线程
        new Thread(new Runnable() {
                @Override
                public void run(){
                    System.out.println(Thread.currentThread().getName() + "线程1");
                }
            }).start();
//        面向函数编程 jdk8后lambda表达式实现面向函数编程
        new Thread(()->{
                System.out.println(Thread.currentThread().getName() + "线程2");
            }
        ).start();
    }
}
