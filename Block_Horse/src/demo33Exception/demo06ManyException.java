package demo33Exception;

/**
 * @author : Bojack
 * @date : Created in 20:30 2021.12.08
 * 多个异常使用捕获又该如何处理呢？
 * 1. 多个异常分别处理。
 * 2. 多个异常一次捕获，多次处理。
 * 3. 多个异常一次捕获一次处理。
 */
public class demo06ManyException {
    public static void main(String[] args) {
        System.out.println("多个异常分别处理。");
        many();
        System.out.println("多个异常一次捕获，多次处理。");
        manyOneMang();
        System.out.println("多个异常一次捕获一次处理。");
        manyOneOne();
    }
    //运行时异常被抛出可以不处理。即不捕获也不声明抛出。
    //默认给虚拟机处理,终止程序,什么时候不抛出运行时异常了,在来继续执行程序
    public static void manyOneOne() {
        try {
            int[] arr = {1, 2, 3};
            int s = arr[3];
            System.out.println(s);
            int[] list = new int[19998 * 9999 * 99999];
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("程序继续运行");
    }

    public static void many() {
        try {
            int[] arr = {1, 2, 3};
            int s = arr[3];
            System.out.println(s);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        try {
            int[] list = new int[19998 * 9999 * 99999];
        } catch (NegativeArraySizeException e) {
            System.out.println(e);
        }
        System.out.println("程序继续运行");
    }
   /* 一个try多个catch注意事项:
    catch里边定义的异常变量,如果有子父类关系,那么子类的异常变量必须写在上边,否则就会报错
    ArrayIndexOutOfBoundsException extends IndexOutOfBoundsException
    */
    public static void manyOneMang() {
        try {
            int[] arr = {1, 2, 3};
            int s = arr[3];
            System.out.println(s);
            int[] list = new int[19998 * 9999 * 99999];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (NegativeArraySizeException e) {
            System.out.println(e);
        }
        System.out.println("程序继续运行");
    }
}