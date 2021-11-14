package demo02Anonymous;

/**
 * @author : Bojack
 * @date : 2021年10月11日21:25:31
 * 创建对象的标准格式：
 * 类名称 对象名 = new 类名称();
 * <p>
 * 匿名对象就是只有右边的对象，没有左边的名字和赋值运算符。
 * new 类名称();
 * <p>
 * 注意事项：匿名对象只能使用唯一的一次，下次再用不得不再创建一个新对象。
 * 使用建议：如果确定有一个对象只需要使用唯一的一次，就可以用匿名对象。
 */
public class personUSe {
    public static void main(String[] args) {
        person one = new person();
        one.name = "余盛军";
        one.sayname();

        new person().name = "余盛军";
        new person().sayname();

    }
}
