package demo40MyFunctionalInterface.Lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author : Bojack
 * @date : Created in 20:10 2022.02.27
 * ���һ�������ķ���ֵ������һ������ʽ�ӿڣ���ô�Ϳ���ֱ�ӷ���һ��Lambda���ʽ��
 * ����Ҫͨ��һ����������ȡһ��java.util.Comparator�ӿ����͵Ķ�����Ϊ������ʱ,�Ϳ��Ե��÷�����ȡ��
 */
public class PracticForReturn {
    public static Comparator<String> show() {
        //������
//        return new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.length() - o1.length();
//            }
//        };
        //�򻯰�
//        return (String o1,String o2)->{
//          return  o2.length()-o1.length();
//        };
        //������
        return (o1,o2)->o1.length()-o2.length();
    }

    public static void main(String[] args) {
        String [] arr={"aaaaaaaaaaaaa","bbbb","ccc","dd"};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr,show());
        System.out.println(Arrays.toString(arr));
    }
}
