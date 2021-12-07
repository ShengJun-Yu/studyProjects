package demo30Jdk9;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author : Bojack
 * @date : Created in 21:08 2021.12.07
    JDK9��������:
        List�ӿ�,Set�ӿ�,Map�ӿ�:���������һ����̬�ķ���of,���Ը�����һ������Ӷ��Ԫ��
        static <E> List<E> of?(E... elements)
        ʹ��ǰ��:
            �������д洢��Ԫ�صĸ����Ѿ�ȷ����,���ڸı�ʱʹ��
     ע��:
        1.of����ֻ������List�ӿ�,Set�ӿ�,Map�ӿ�,�������ڽӽӿڵ�ʵ����
        2.of�����ķ���ֵ��һ�����ܸı�ļ���,���ϲ�����ʹ��add,put�������Ԫ��,���׳��쳣
        3.Set�ӿں�Map�ӿ��ڵ���of������ʱ��,�������ظ���Ԫ��,������׳��쳣
 */
public class jdk9 {
        public static void main(String[] args) {
            List<String> list = List.of("a", "b", "a", "c", "d");
            System.out.println(list);//[a, b, a, c, d]
            //list.add("w");//UnsupportedOperationException:��֧�ֲ����쳣

            //Set<String> set = Set.of("a", "b", "a", "c", "d");//IllegalArgumentException:�Ƿ������쳣,���ظ���Ԫ��
            Set<String> set = Set.of("a", "b", "c", "d");
            System.out.println(set);
            //set.add("w");//UnsupportedOperationException:��֧�ֲ����쳣

            //Map<String, Integer> map = Map.of("����", 18, "����", 19, "����", 20,"����",19);////IllegalArgumentException:�Ƿ������쳣,���ظ���Ԫ��
            Map<String, Integer> map = Map.of("����", 18, "����", 19, "����", 20);
            System.out.println(map);//{����=20, ����=19, ����=18}
            //map.put("����",30);//UnsupportedOperationException:��֧�ֲ����쳣
        }
    }


