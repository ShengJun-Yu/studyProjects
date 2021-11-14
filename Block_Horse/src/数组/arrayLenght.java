package 数组;

/**
 * @author : Bojack
 * @date : 2021年9月24日17:47:55
 * 如何获取数组的长度，格式：
 * 数组名称.length
 * 这将会得到一个int数字，代表数组的长度。
 * <p>
 * 数组一旦创建，程序运行期间，长度不可改变。
 */
public class arrayLenght {
    public static void main(String[] args) {
        int arrayA[] = new int[3];
        int arrayB[] = {2, 3, 4, 5};
        int la = arrayB.length;
        System.out.println(la);

        int arrayC[] = new int[3];
        System.out.println(arrayC.length);
        arrayC = new int[5];
        System.out.println(arrayC.length);

    }
}
