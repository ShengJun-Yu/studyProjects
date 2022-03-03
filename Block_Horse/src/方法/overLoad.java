package 方法;

/**
 * @author : Bojack
 * @date : 2021年9月22日21:00:14
 * 对于功能类似的方法，因为参数列表不一样，却要记住很多不同名字的方法名字，
 * 解决方法：
 * 方法的重载（Overload）：多个方法名称一样参数列表一样。
 * 好处：只需要记住唯一一个方法名称，就可以实现类似的多个功能。
 *
 * 方法重载与下列因素相关：
 * 1. 参数个数不同
 * 2. 参数类型不同
 * 3. 参数的多类型顺序不同
 *
 * 方法重载与下列因素无关：（不可重载）
 * 1. 与参数的名称无关
 * 2. 与方法的返回值类型无关
 */
public class overLoad {
    public static void main(String[] args) {
//        System.out.println(sumTwo(10, 20)); // 30
//        System.out.println(sumThree(10, 20, 30)); // 60
//        System.out.println(sumFour(10, 20, 30, 40)); // 100
        System.out.println(sum(3,4));//两个参数的方法
        System.out.println(sum(3,4,5));//三个参数的方法
        System.out.println(sum(3,4,5,4));//四个参数的方法

    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static long sum(int a, int b, int c, long d) {
        return a + b + c + d;
    }


}
