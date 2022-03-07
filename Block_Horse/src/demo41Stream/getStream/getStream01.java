package demo41Stream.getStream;

import java.util.*;
import java.util.stream.Stream;

/**
 * @author : Bojack
 * @date : Created in 15:31 2022.03.07
 * java.util.stream.Stream<T>��Java 8�¼������õ����ӿڡ����Ⲣ����һ������ʽ�ӿڡ���
 * ��ȡһ�����ǳ��򵥣������¼��ֳ��õķ�ʽ��
 * - ���е�Collection���϶�����ͨ��streamĬ�Ϸ�����ȡ����
 * default Stream<E> stream?()
 * - Stream�ӿڵľ�̬����of���Ի�ȡ�����Ӧ������
 * static <T> Stream<T> of?(T... values)
 * ������һ���ɱ����,��ô���ǾͿ��Դ���һ������
 */
public class getStream01 {
    public static void main(String[] args) {
        //�Ѽ���ת��ΪStream��
        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> stream2 = set.stream();

        Map<String, String> map = new HashMap<>();
        //��ȡ��,�洢��һ��Set������
        Set<String> strings = map.keySet();
        Stream<String> stream3 = strings.stream();
        //��ȡֵ,�洢��һ��Collection������
        Collection<String> values = map.values();
        Stream<String> stream4 = values.stream();
        //��ȡ��ֵ��(����ֵ��ӳ���ϵ entrySet)
        Set<Map.Entry<String, String>> entries = map.entrySet();
        Stream<Map.Entry<String, String>> stream5 = entries.stream();
        //������ת��ΪStream��
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        //�ɱ�������Դ�������
        int[] arr = {1, 2, 3, 4};
        Stream<int[]> stream6 = Stream.of(arr);
    }
}
