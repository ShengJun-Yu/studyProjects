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
//        ����һ������copytarget������������target
        ArrayList<Integer> copytarget = new ArrayList<>();
//        ������target���浽����copytarget��
        for (int i : target) {
            copytarget.add(i);
        }
//        ����һ����ֵcopynums��������nums
        int[] copynums = nums;
//        ����copynums������
        int c = 0;
//        Ƕ��ѭ����ʹ����nums��ÿһ����ͬԪ��֮�䶼���
        do {
            for (int i = c + 1; i < nums.length; i++) {
//                �ó���Ӻ�ĺ�
                int sum = copynums[c] + nums[i];
//                �жϺ��Ƿ���copyterget�м��Ƿ���Ŀ������terget��
                if (copytarget.contains(sum)) {
                    System.out.println("�������ֱ�Ϊ��" + copynums[c] + "��" + nums[i] + "," + "�±�ֱ�ΪΪ��" + c + "��" + (i));
                }
            }
            c++;
        } while (c < copynums.length);
    }
}

