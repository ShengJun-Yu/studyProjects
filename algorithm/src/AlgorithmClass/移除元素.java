package AlgorithmClass;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author : Bojack
 * @date : Created in 10:27 2022.02.28
 */
public class ÒÆ³ýÔªËØ {
    public static void main(String[] args) {
        int [] arr={1,2,4,6,6,8,8,543,24,234,6};
//        Object[] dele = dele(arr, 6);
//        for (int i = 0; i < dele.length; i++) {
//            System.out.println(dele[i]);
//        }
        int dele = dele(arr, 6);
        System.out.println(dele);

    }
    public static int dele(int [] arr,int val){
//        int lenth=arr.length;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr [i]==val){
//                for (int j = i+1; j <lenth ; j++) {
//                    arr[j-1]=arr[j];
//                }
//                lenth--;
////                i--;
//            }
//        }
//        return lenth;
        Collection<Integer> col=new ArrayList<>();
        for (int i=0;i<arr.length;i++) {
            if (arr[i]!=val)
            col.add(arr[i]);
        }
        Object[] array = col.toArray();
        int arrays=array.length;
        return arrays;
    }
}
