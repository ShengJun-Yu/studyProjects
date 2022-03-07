package demo42methodsReference;

/**
 * @author : Bojack
 * @date : Created in 19:05 2022.03.07
 *  通过类名引用静态成员方法
 *     类已经存在,静态成员方法也已经存在
 *     就可以通过类名直接引用静态成员方法
 */
public class demo03Main {
    public static  int com(int num,demo03Interface dw){
        return dw.jdz(num);
    }

    public static void main(String[] args) {
        int num=-121;
        int com = com(num, (n) -> Math.abs(n));
        System.out.println(com);
 /*
            使用方法引用优化Lambda表达式
            Math类是存在的
            abs计算绝对值的静态方法也是已经存在的
            所以我们可以直接通过类名引用静态方法
         */
        int com1 = com(num, Math::abs);
        System.out.println(com1);
    }
}
