package demo40MyFunctionalInterface.Lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author : Bojack
 * @date : Created in 20:10 2022.02.27
 * 如果一个方法的返回值类型是一个函数式接口，那么就可以直接返回一个Lambda表达式。
 * 当需要通过一个方法来获取一个java.util.Comparator接口类型的对象作为排序器时,就可以调该方法获取。
 */
public class PracticForReturn {
    public static Comparator<String> show() {
        //完整版
//        return new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.length() - o1.length();
//            }
//        };
        //简化版
//        return (String o1,String o2)->{
//          return  o2.length()-o1.length();
//        };
        //究极版
        return (o1,o2)->o1.length()-o2.length();
    }

    public static void main(String[] args) {
        String [] arr={"aaaaaaaaaaaaa","bbbb","ccc","dd"};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr,show());
        System.out.println(Arrays.toString(arr));
    }
}
