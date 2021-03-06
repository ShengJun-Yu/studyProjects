package demo37Recursive;

/**
 * @author : Bojack
 * @date : Created in 20:23 2021.12.27
 * 递归:方法自己调用自己
 * - 递归的分类:
 * - 递归分为两种，直接递归和间接递归。
 * - 直接递归称为方法自身调用自己。
 * - 间接递归可以A方法调用B方法，B方法调用C方法，C方法调用A方法。
 * - 注意事项：
 * - 递归一定要有条件限定，保证递归能够停止下来，否则会发生栈内存溢出。
 * - 在递归中虽然有限定条件，但是递归次数不能太多。否则也会发生栈内存溢出。
 * - 构造方法,禁止递归
 * 递归的使用前提:
 * 当调用方法的时候,方法的主体不变,每次调用方法的参数不同,可以使用递归
 */
public class demo01 {
    public static void main(String[] args) {
//        a();//StackOverflowError
        System.out.println("1-max之和；");
        int b = b(5);
        System.out.println(b);
        System.out.println("阶乘计算结果：");
        int jeichen = jeichen(6);
        System.out.println(jeichen);
        System.out.println("");

    }
//    递归写法，计算阶乘
    private static int jeichen(int n){
        if (n==1){
            return 1;
        }
        return n*jeichen(n-1);

    }
//    递归写法，计算1-max之和；不推荐使用递归写法占用资源过高
    private static int b(int max) {
        if (max==1){
            return 1;
        }
        return max + b(max - 1);
    }
    //    使用递归写法，一直调用自己，会导致栈内存溢出StackOverflowError
    private static void a() {
        System.out.println("a方法");//StackOverflowError
        a();
    }
}
