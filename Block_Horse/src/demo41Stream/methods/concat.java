package demo41Stream.methods;

import java.util.stream.Stream;

/**
 * @author : Bojack
 * @date : Created in 16:07 2022.03.07
 *  Stream流中的常用方法_concat:用于把流组合到一起
 *     如果有两个流，希望合并成为一个流，那么可以使用Stream接口的静态方法concat
 *     static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b)
 */
public class concat {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三", "李四", "王五", "赵六", "田七");
        Stream<String> stringStream = Stream.of("1", "2", "3", "4");
        Stream<String> concat = Stream.concat(stringStream, stream);
        concat.forEach((i)-> System.out.println(i));
    }
}
