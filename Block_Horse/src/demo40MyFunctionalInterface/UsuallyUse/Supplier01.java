package demo40MyFunctionalInterface.UsuallyUse;

import java.util.function.Supplier;

/**
 * @author : Bojack
 * @date : Created in 20:50 2022.02.27
 * 常用的函数式接口
 * java.util.function.Supplier<T>接口仅包含一个无参的方法：T get()。用来获取一个泛型参数指定类型的对象数据。
 * <p>
 * Supplier<T>接口被称之为生产型接口,指定接口的泛型是什么类型,那么接口中的get方法就会生产什么类型的数据
 */
public class Supplier01 {
    public static int showMax(Supplier<Integer> sup) {
        return sup.get();
    }

    public static void main(String[] args) {
//        String show = show(new Supplier<String>() {
//            @Override
//            public String get() {
//                return "余盛军";
//            }
//        });
        int show = showMax(() -> 11);
        System.out.println(show);

        int showMax=showMax(()->{
           int[] arr={213,210,121,123,1};
           int max=arr[0];
            for (int i:arr) {
                if(i>max){
                    max=arr[i];
                }
            }
           return max;
        });
        System.out.println(showMax);

    }
}
