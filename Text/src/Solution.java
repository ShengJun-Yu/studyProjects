import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : Bojack
 * @date : Created in 21:56 2021.12.02
 */
public class Solution {
    public static void main(String[] args) {
        //newһ�����������÷Ǿ�̬����twoSum()
        Solution s1 = new Solution();

        System.out.print("����������ĳ��ȣ�");
        Scanner sc1 = new Scanner(System.in);
        int arrLength = sc1.nextInt();

        //����һ����������nums
        int[] nums = new int[arrLength];

        //��������
        for (int i = 0; i < arrLength; i++) {
            System.out.print("������������Ϊ" + i + "������Ԫ�ص�ֵ��");
            Scanner sc2 = new Scanner(System.in);
            nums[i] = sc2.nextInt();
        }

        System.out.print("������targetֵ��");
        Scanner sc3 = new Scanner(System.in);
        int target = sc3.nextInt();

        System.out.println("���ص��ǣ�" + Arrays.toString(s1.twoSum(nums, target)));
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

