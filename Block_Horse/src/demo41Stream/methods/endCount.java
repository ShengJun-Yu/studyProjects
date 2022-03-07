package demo41Stream.methods;

import java.util.stream.Stream;

/**
 * @author : Bojack
 * @date : Created in 15:59 2022.03.07
 *   Stream流中的常用方法_count:用于统计Stream流中元素的个数
 *     long count();
 *
 *     count方法是一个终结方法,返回值是一个long类型的整数
 *     所以不能再继续调用Stream流中的其他方法了
 */
public class endCount {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("1", "2", "3", "4");
        Stream<Integer> integerStream = stringStream.map((s) -> Integer.parseInt(s));
        long count = integerStream.count();
        System.out.println(count);
    }
}
