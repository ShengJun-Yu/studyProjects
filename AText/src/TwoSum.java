import java.util.HashMap;

/**
 * @author : Bojack
 * @date : Created in 18:13 2021.12.02
 * ����һ����������nums��һ������Ŀ��ֵtarget�����ڸ��������ҳ���ΪĿ��ֵtarget�����������������������ǵ������±�
 * public boolean contains(E e): �жϵ�ǰ�������Ƿ���������Ķ���
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] a = {1, 2,3,4,5,6};
        int b = 6;
        int[] demo = twoSum(a, b);
        System.out.println(demo[0]);
        System.out.println("======================");
        System.out.println(demo[1]);

    }
    public static int[] twoSum(int[] nums, int target) {
        int[] indexs = new int[2];
        // ����k-v ��һһ��Ӧ�Ĺ�ϣ��
        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            if(hash.containsKey(nums[i])){
                indexs[0] = i;
                indexs[1] = hash.get(nums[i]);
                return indexs;
            }
            // �����ݴ��� keyΪ���� ��valueΪ�±�
            hash.put(target-nums[i],i);
        }
        return indexs;
    }

    public static int[] demo(int[] nums, int target) {
        int [] index=new int [2];
        int[] copynums = nums;
        int c=0;
        int sum1;
        do {
            for (int i = c+1; i < nums.length; i++) {
                sum1=copynums[c] + nums[i];
                if(target==sum1){
                    index[0]=c;
                    index[1]=i;
                 return index;
                }
            }
            c++;
        }while (c<copynums.length);
        return index;
    }
}
