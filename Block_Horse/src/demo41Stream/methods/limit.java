package demo41Stream.methods;

import java.util.stream.Stream;

/**
 * @author : Bojack
 * @date : Created in 16:02 2022.03.07
 * \Stream流中的常用方法_limit:用于截取流中的元素
 *     limit方法可以对流进行截取，只取用前n个。方法签名：
 *     Stream<T> limit(long maxSize);
 *         参数是一个long型，如果集合当前长度大于参数则进行截取；否则不进行操作
 *     limit方法是一个延迟方法,只是对流中的元素进行截取,返回的是一个新的流,所以可以继续调用Stream流中的其他方法
 */
public class limit {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三", "李四", "王五", "赵六", "田七");
        Stream<String> limit = stream.limit(3);
        limit.forEach((i)-> System.out.println(i));
    }
}
