package demo05String;

/**
 * @author : Bojack
 * @date : 2021年10月16日14:12:27
 * ==是进行对象的地址值比较，如果确实需要字符串的内容比较，可以使用两个方法：
 *
 * public boolean equals(Object obj)：参数可以是任何对象，只有参数是一个字符串并且内容相同的才会给true；否则返回false。
 * 注意事项：
 * 1. 任何对象都能用Object进行接收。
 * 2. equals方法具有对称性，也就是a.equals(b)和b.equals(a)效果一样。
 * 3. 如果比较双方一个常量一个变量，推荐把常量字符串写在前面。
 * 推荐："abc".equals(str)    不推荐：str.equals("abc")
 *
 * public boolean equalsIgnoreCase(String str)：忽略大小写，进行内容比较。
 */
public class StringEquals {
    public static void main(String[] args) {
        String str1="abc";
        String str2="abc";
        char[] chara={'a','b','c'};
        String str3=new String(chara);

        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals(str1));
        System.out.println(str1.equals(str3));

        String str4=null;
        System.out.println("abc".equals(str4));
      //  System.out.println(str4.equals("abc"));//不可这样,若赋值为空则会报错

        //public boolean equalsIgnoreCase(String str)：忽略大小写，进行内容比较。
        String str5="ABC";
        String str6="abc";
        System.out.println(str5.equalsIgnoreCase(str6));
        System.out.println("Abc".equalsIgnoreCase(str6));







    }
}
