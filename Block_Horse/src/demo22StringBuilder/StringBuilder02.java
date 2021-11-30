package demo22StringBuilder;

/**
 * @author : Bojack
 * @date : Created in 19:16 2021.11.25
 * StringBuilder的常用方法:
 * public StringBuilder append(...)：添加任意类型数据的字符串形式，并返回当前对象自身。
 * public StringBuilder reverse(...);   导致该字符序列被序列的相反代替。
 * public String toString()返回表示此顺序中的数据的字符串。
 */
public class StringBuilder02 {
    public static void main(String[] args) {
        StringBuilder st = new StringBuilder();
        StringBuilder st1 = st.append(12);
        System.out.println(st == st1);//true
        System.out.println(st);
         /*
            public StringBuilder append(...)：添加任意类型数据的字符串形式，并返回当前对象自身。
            append方法返回的为当前对象自身
            链式编程:方法返回值是一个对象,可以继续调用方法
         */
        st.append(31).append("ftftft").append("结尾");
        System.out.println(st);
         /*
             public StringBuilder reverse(...);   导致该字符序列被序列的相反代替。
          */
        st.reverse();
        System.out.println(st);
        System.out.println("=================");
        /*
         StringBuilder和String可以相互转换:
             String->StringBuilder:可以使用StringBuilder的构造方法
                 StringBuilder(String str) 构造一个字符串生成器，并初始化为指定的字符串内容。
             StringBuilder->String:可以使用StringBuilder中的toString方法
                 public String toString()：将当前StringBuilder对象转换为String对象。
          */
        String name="jun";
        StringBuilder str = new StringBuilder(name);
        System.out.println(str);
        String s = str.toString();
        System.out.println(s);

    }

}
