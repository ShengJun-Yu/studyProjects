package demo23Integer;

/**
 * @author : Bojack
 * @date : Created in 19:56 2021.11.25
 * 装箱:把基本类型的数据,包装到包装类中(基本类型的数据->包装类)
 * 构造方法:
 * Integer(int value) 构造一个新分配的 Integer 对象，它表示指定的 int 值。
 * Integer(String s) 构造一个新分配的 Integer 对象，它表示 String 参数所指示的 int 值。
 * 传递的字符串,必须是基本类型的字符串,否则会抛出异常 "100" 正确  "a" 抛异常
 * 静态方法:
 * static Integer valueOf(int i) 返回一个表示指定的 int 值的 Integer 实例。
 * static Integer valueOf(String s) 返回保存指定的 String 的值的 Integer 对象。
 * 拆箱:在包装类中取出基本类型的数据(包装类->基本类型的数据)
 * 成员方法:
 * int intValue() 以 int 类型返回该 Integer 的值。
 */
public class IntegerPackaging {
    public static void main(String[] args) {
        //装箱构造方法
        Integer in = new Integer(32);
        System.out.println(in);
        Integer str = new Integer("324");
        System.out.println(str);
        //装箱静态方法
        Integer i = Integer.valueOf(13);
        System.out.println(i);
        Integer i1 = Integer.valueOf("232");
        System.out.println(i1);
        //拆箱成员方法
        int int1 = i.intValue();
        System.out.println(int1);
    }
}
