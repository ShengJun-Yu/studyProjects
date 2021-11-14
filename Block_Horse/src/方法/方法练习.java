package 方法;

/**
 * @author : Bojack
 * @date : 2021年9月22日20:25:17
 *使用方法的时候，注意事项：
 *
 * 1. 方法应该定义在类当中，但是不能在方法当中再定义方法。不能嵌套。
 * 2. 方法定义的前后顺序无所谓。
 * 3. 方法定义之后不会执行，如果希望执行，一定要调用：单独调用、打印调用、赋值调用。
 * 4. 如果方法有返回值，那么必须写上“return 返回值;”，不能没有。
 * 5. return后面的返回值数据，必须和方法的返回值类型，对应起来。
 * 6. 对于一个void没有返回值的方法，不能写return后面的返回值，只能写return自己。
 * 7. 对于void方法当中最后一行的return可以省略不写。
 * 8. 一个方法当中可以有多个return语句，但是必须保证同时只有一个会被执行到，两个return不能连写。
 */
public class 方法练习 {
    public static void main(String[] args) {
        System.out.println(sam(3, 3));

        int he = sum();
        System.out.println(he);

        printhello(4);
    }

    /**
     * 定义一个方法，用来判断两个数字是否相同。
     *
     * @param a
     * @param b
     * @return
     */
    public static boolean sam(int a, int b) {
//        boolean same;
//        if (a==b){
//            same=ture;
//        }else{
//            same=false;
//        }
//        return same;
        return a == b;
    }

    /**
     * 定义一个方法，用来求出1-100之间所有数字的和值。
     */
    public static int sum() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }
    /**
     * 定义一个方法，用来打印指定次数的HelloWorld。
     */
    public static void  printhello(int num){
        for (int i = 0; i < num; i++) {
            System.out.println("hello");
        }
    }
}
