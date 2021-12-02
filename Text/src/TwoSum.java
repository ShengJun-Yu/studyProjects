import java.util.ArrayList;

/**
 * @author : Bojack
 * @date : Created in 18:13 2021.12.02
 * 给定一个整数数组nums和一个整数目标值target，请在该数组中找出和为目标值target的那两个整数，并返回他们的数组下标
 * public boolean contains(E e): 判断当前集合中是否包含给定的对象。
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
                    System.out.println("两整数为："+copynums[c]+"和"+nums[i]+","+"下标为："+c+"和"+(i));
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
