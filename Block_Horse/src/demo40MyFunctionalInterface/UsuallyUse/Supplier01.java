package demo40MyFunctionalInterface.UsuallyUse;

import java.util.function.Supplier;

/**
 * @author : Bojack
 * @date : Created in 20:50 2022.02.27
 * ���õĺ���ʽ�ӿ�
 * java.util.function.Supplier<T>�ӿڽ�����һ���޲εķ�����T get()��������ȡһ�����Ͳ���ָ�����͵Ķ������ݡ�
 * <p>
 * Supplier<T>�ӿڱ���֮Ϊ�����ͽӿ�,ָ���ӿڵķ�����ʲô����,��ô�ӿ��е�get�����ͻ�����ʲô���͵�����
 */
public class Supplier01 {
    public static int showMax(Supplier<Integer> sup) {
        return sup.get();
    }

    public static void main(String[] args) {
//        String show = show(new Supplier<String>() {
//            @Override
//            public String get() {
//                return "��ʢ��";
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
