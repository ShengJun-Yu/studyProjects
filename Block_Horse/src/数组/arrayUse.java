package 数组;

/**
 * @author : Bojack
 * @date : 2021年9月23日18:27:13
 * 直接打印数组名称，得到的是数组对应的：内存地址哈希值。
 * 二进制：01
 * 十进制：0123456789
 * 16进制：0123456789abcdef
 *
 * 访问数组元素的格式：数组名称[索引值]
 * 索引值：就是一个int数字，代表数组当中元素的编号。
 * 【注意】索引值从0开始，一直到“数组的长度-1”为止。
 */
public class arrayUse {
    public static void main(String[] args) {
        int[] array = {3, 41, 522};
        System.out.println(array);//内存地址哈希值。
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        int num =array[2];
        System.out.println(num);
        for (int i = 0; i <= 2; i++) {
            System.out.println("数组为："+array[i]);
        }
        动态数组();
    }

    /**
     * 使用动态初始化数组的时候，其中的元素将会自动拥有一个默认值。规则如下：
     * 如果是整数类型，那么默认为0；
     * 如果是浮点类型，那么默认为0.0；
     * 如果是字符类型，那么默认为'\u0000'；
     * 如果是布尔类型，那么默认为false；
     * 如果是引用类型，那么默认为null。
     *
     * 注意事项：
     * 静态初始化其实也有默认值的过程，只不过系统自动马上将默认值替换成为了大括号当中的具体数值。
     */

    public static void 动态数组(){
        int [] array=new int[4];
        array[1]=888;//赋值 
        System.out.println(array);//内存地址哈希值。
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
    }
}
