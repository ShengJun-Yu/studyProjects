package AlgorithmClass;

/**
 * @author : Bojack
 * @date : Created in 14:31 2022.02.22
 * ����һ��?n?��Ԫ������ģ�������������?nums ��һ��Ŀ��ֵ?target ?��дһ����������?nums?�е� target�����Ŀ��ֵ���ڷ����±꣬���򷵻� -1��
 * <p>
 * <p>
 * ʾ�� 1:
 * <p>
 * ����: nums = [-1,0,3,5,9,12], target = 9
 * ���: 4
 * ����: 9 ������ nums �в����±�Ϊ 4
 * ʾ��?2:
 * <p>
 * ����: nums = [-1,0,3,5,9,12], target = 2
 * ���: -1
 * ����: 2 ������ nums ����˷��� -1
 * <p>
 * ��Դ�����ۣ�LeetCode��
 * ���ӣ�https://leetcode-cn.com/problems/binary-search
 * ����Ȩ������������С���ҵת������ϵ�ٷ���Ȩ������ҵת����ע��������
 */
public class ���ֲ��� {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7};
        int target = 5;
        int search = search(num, target);
        System.out.println(search);
    }

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int midIndex = (left + right) / 2;
            int midValue = nums[midIndex];
            if (midValue == target) {
                return midIndex;
            } else if (midValue < target) {
                left = midIndex + 1;
            } else {
                right = midIndex - 1;
            }
        }
        return -1;
    }

}
