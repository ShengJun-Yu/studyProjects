package 数组;

/**
 * @author : Bojack
 * @date : 2021年9月24日17:30:45
 * <p>
 * 数组的索引编号从0开始，一直到“数组的长度-1”为止。
 * 如果访问数组元素的时候，索引编号并不存在，那么将会发生
 * 数组索引越界异常
 * ArrayIndexOutOfBoundsException
 * 原因：索引编号写错了。
 * 解决：修改成为存在的正确索引编号。
 */
class 数组越界和空指针 {
    public static void main(String[] args) {
        outofBound();
        arrayNull();

    }

    public static void outofBound() {
        int[] array = {15, 25, 35};

        System.out.println(array[0]); //15
        System.out.println(array[1]); // 25
        System.out.println(array[2]); // 35

        // 错误写法
        // 并不存在3号元素，所以发生异常
        System.out.println(array[2]);
    }

    /**
     * 所有的引用类型变量，都可以赋值为一个null值。但是代表其中什么都没有。
     * 数组必须进行new初始化才能使用其中的元素。
     * 如果只是赋值了一个null，没有进行new创建，
     * 那么将会发生：
     * 空指针异常 NullPointerException
     * 原因：忘了new
     * 解决：补上new
     */
    public static void arrayNull() {
        int array[];
             array=new int [3];
        System.out.println(array[0]);
    }

}