package demo42methodsReference;

/**
 * @author : Bojack
 * @date : Created in 18:27 2022.03.07
 */
public class demo01Main {
    public static void pr(AInterface d) {
        d.printlns("ysj,hello!");
    }

    public static void main(String[] args) {
        pr((name) -> System.out.println(name));
  /*
            分析:
                Lambda表达式的目的,打印参数传递的字符串
                把参数s,传递给了System.out对象,调用out对象中的方法println对字符串进行了输出
                注意:
                    1.System.out对象是已经存在的
                    2.println方法也是已经存在的
                所以我们可以使用方法引用来优化Lambda表达式
                可以使用System.out方法直接引用(调用)println方法
         */
        pr(System.out::println);
    }
}
