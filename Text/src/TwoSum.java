import java.util.ArrayList;

/**
 * @author : Bojack
 * @date : Created in 18:13 2021.12.02
 * ����һ����������nums��һ������Ŀ��ֵtarget�����ڸ��������ҳ���ΪĿ��ֵtarget�����������������������ǵ������±�
 * public boolean contains(E e): �жϵ�ǰ�������Ƿ���������Ķ���
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] a = {1, 2,3,4,5};
        int[] b = {8, 5, 9, 10};
        demo(a,b);
    }

    public static void demo(int[] nums, int[] target) {
        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<Integer>  copysum= new ArrayList<>();
//        ArrayList<Integer>  sum= new ArrayList<>();
        ArrayList<Integer> copytarget = new ArrayList<>();
        for (int i : target) {
            copytarget.add(i);
        }
        int[] copynums = nums;
        int c=0;
        int sum1;
        do {
            for (int i = c+1; i < nums.length; i++) {
                sum1=copynums[c] + nums[i];
                if(copytarget.contains(sum1)){
                    System.out.println("������Ϊ��"+copynums[c]+"��"+nums[i]+","+"�±�Ϊ��"+c+"��"+(i));
                    System.out.println();
                }
//                copysum.add(sum1);
//                public boolean contains(E e)
            }
            c++;
        }while (c<copynums.length);
//        System.out.println(copysum);
//        for (int i1 = 0; i1 < copysum.size(); i1++) {
//            if(copytarget.contains(copysum.get(i1))){
//               sum.add(copysum.get(i1));
//            }
//        }
//        System.out.println(sum);

    }
}
