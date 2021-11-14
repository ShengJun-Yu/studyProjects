package 方法;

/**
 * @author : Bojack
 * @date : 2021年9月24日19:57:47
 * 一个方法可以有0、1、多个参数；但是只能有0或者1个返回值，不能有多个返回值。
 * 如果希望一个方法当中产生了多个结果数据进行返回，怎么办？
 * 解决方案：使用一个数组作为返回值类型即可。
 * <p>
 * 任何数据类型都能作为方法的参数类型，或者返回值类型。
 * <p>
 * 数组作为方法的参数，传递进去的其实是数组的地址值。
 * 数组作为方法的返回值，返回的其实也是数组的地址值。
 */
public class arrayReturn {
    public static void main(String[] args) {
        int a[] = jishuan(3, 88, 8);
        System.out.println("main方法接受到的返回值为：" + a);
        System.out.println("sum=" + a[0]);
        System.out.println("avg=" + a[1]);


    }

    public static int[] jishuan(int a, int b, int c) {
        int sum = a + b + c;
        int avg = sum / 3;
        int[] array = {sum, avg};
        System.out.println("jishuan方法内部数组是" + array);
        return array;

    }

}
