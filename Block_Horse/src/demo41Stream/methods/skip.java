package demo41Stream.methods;

import java.util.stream.Stream;

/**
 * @author : Bojack
 * @date : Created in 16:05 2022.03.07
 *  Stream流中的常用方法_skip:用于跳过元素
 *     如果希望跳过前几个元素，可以使用skip方法获取一个截取之后的新流：
 *     Stream<T> skip(long n);
 *         如果流的当前长度大于n，则跳过前n个；否则将会得到一个长度为0的空流。
 */
public class skip {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三", "李四", "王五", "赵六", "田七");
        Stream<String> skip = stream.skip(2);
        skip.forEach((i)-> System.out.println(i));

    }
}
