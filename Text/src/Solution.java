import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : Bojack
 * @date : Created in 21:56 2021.12.02
 */
public class Solution {
    public static void main(String[] args) {
        //new一个对象来调用非静态方法twoSum()
        Solution s1 = new Solution();

        System.out.print("请输入数组的长度：");
        Scanner sc1 = new Scanner(System.in);
        int arrLength = sc1.nextInt();

        //创建一个整形数组nums
        int[] nums = new int[arrLength];

        //遍历数组
        for (int i = 0; i < arrLength; i++) {
            System.out.print("请输入索引号为" + i + "的数组元素的值：");
            Scanner sc2 = new Scanner(System.in);
            nums[i] = sc2.nextInt();
        }

        System.out.print("请输入target值：");
        Scanner sc3 = new Scanner(System.in);
        int target = sc3.nextInt();

        System.out.println("返回的是：" + Arrays.toString(s1.twoSum(nums, target)));
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}

