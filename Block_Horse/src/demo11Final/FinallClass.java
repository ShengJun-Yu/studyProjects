package demo11Final;

/**
 * @author : Bojack
 * @date : Created in 19:17 2021.11.16
 * 当final关键字用来修饰一个类的时候，不可作为父类，所有成员方法无法覆盖重写，格式：
 * public final class 类名称 {
 *     // ...
 * }
 *
 * 含义：当前这个类不能有任何的子类。（太监类）
 * 注意：一个类如果是final的，那么其中所有的成员方法都无法进行覆盖重写（因为没儿子。）
 */
public final class FinallClass {

}
