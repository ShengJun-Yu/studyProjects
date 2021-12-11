import java.util.ArrayList;

/**
 * @author : Bojack
 * @date : Created in 20:32 2021.12.02
 */
public class TexTwoSum {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5,214,2343,242,32,2353};
        int[] b = {8, 5, 9, 10,2143,421,421,3424};
        demo(a, b);
    }
    public static void demo(int[] nums, int[] target) {
//        定义一个集合copytarget用来储存数组target
        ArrayList<Integer> copytarget = new ArrayList<>();
//        将数组target储存到集合copytarget中
        for (int i : target) {
            copytarget.add(i);
        }
//        定义一个数值copynums复制数组nums
        int[] copynums = nums;
//        定义copynums的索引
        int c = 0;
//        嵌套循环，使数组nums中每一个不同元素之间都相加
        do {
            for (int i = c + 1; i < nums.length; i++) {
//                得出相加后的和
                int sum = copynums[c] + nums[i];
//                判断和是否在copyterget中即是否在目标数组terget中
                if (copytarget.contains(sum)) {
                    System.out.println("两整数分别为：" + copynums[c] + "和" + nums[i] + "," + "下标分别为为：" + c + "和" + (i));
                }
            }
            c++;
        } while (c < copynums.length);
    }
}

