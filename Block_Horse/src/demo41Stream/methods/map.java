package demo41Stream.methods;

import java.util.stream.Stream;

/**
 * @author : Bojack
 * @date : Created in 15:56 2022.03.07
 *   Stream���еĳ��÷���_map:��������ת��
 *     �����Ҫ�����е�Ԫ��ӳ�䵽��һ�����У�����ʹ��map����.
 *     <R> Stream<R> map(Function<? super T, ? extends R> mapper);
 *     �ýӿ���Ҫһ��Function����ʽ�ӿڲ��������Խ���ǰ���е�T��������ת��Ϊ��һ��R���͵�����
 *     Function�еĳ��󷽷�:
 *         R apply(T t);
 */
public class map {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("1", "2", "3", "4");
        Stream<Integer> integerStream = stringStream.map((s) -> Integer.parseInt(s));
        integerStream.forEach((i)-> System.out.println(i));

    }
}
