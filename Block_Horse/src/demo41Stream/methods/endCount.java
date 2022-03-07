package demo41Stream.methods;

import java.util.stream.Stream;

/**
 * @author : Bojack
 * @date : Created in 15:59 2022.03.07
 *   Stream���еĳ��÷���_count:����ͳ��Stream����Ԫ�صĸ���
 *     long count();
 *
 *     count������һ���ս᷽��,����ֵ��һ��long���͵�����
 *     ���Բ����ټ�������Stream���е�����������
 */
public class endCount {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("1", "2", "3", "4");
        Stream<Integer> integerStream = stringStream.map((s) -> Integer.parseInt(s));
        long count = integerStream.count();
        System.out.println(count);
    }
}
