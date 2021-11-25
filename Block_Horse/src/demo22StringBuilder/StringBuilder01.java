package demo22StringBuilder;

/**
 * @author : Bojack
 * @date : Created in 19:13 2021.11.25
 *     java.lang.StringBuilder类:字符串缓冲区,可以提高字符串的效率
 *     构造方法:
 *         StringBuilder() 构造一个不带任何字符的字符串生成器，其初始容量为 16 个字符。
 *         StringBuilder(String str) 构造一个字符串生成器，并初始化为指定的字符串内容。
 */
public class StringBuilder01 {
    public static void main(String[] args) {
//        StringBuilder() 构造一个不带任何字符的字符串生成器，其初始容量为 16 个字符。
        StringBuilder str=new StringBuilder();
        System.out.println(str);
        //StringBuilder(String str) 构造一个字符串生成器，并初始化为指定的字符串内容。
        StringBuilder str1=new StringBuilder("ybyby");
        System.out.println(str1);

    }
}

