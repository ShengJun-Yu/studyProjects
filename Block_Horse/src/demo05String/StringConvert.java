package demo05String;

/**
 * @author : Bojack
 * @date : 2021年10月16日15:38:12
 * String当中与转换相关的常用方法有：
 *
 * public char[] toCharArray()：将当前字符串拆分成为字符数组作为返回值。
 * public byte[] getBytes()：获得当前字符串底层的字节数组。
 * public String replace(CharSequence oldString, CharSequence newString)：
 * 将所有出现的老字符串替换成为新的字符串，返回替换之后的结果新字符串。
 * 备注：CharSequence意思就是说可以接受字符串类型。
 */
public class StringConvert {
    public static void main(String[] args) {
        // public char[] toCharArray()：将当前字符串拆分成为字符数组作为返回值。
        String str="abc";
        char[] chars = str.toCharArray();
        System.out.println(chars[1]);
        System.out.println(chars.length);
        //public byte[] getBytes()：获得当前字符串底层的字节数组。
        byte[] bytes = str.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]+"");
        }
        //public String replace(CharSequence oldString, CharSequence newString)：
        String str1="Hello World!";
        String str2=str1.replace("l","P");
        System.out.println(str2);

        //应用，游戏骂人屏蔽
        String ma ="操你妈的，你妈死了吗？没妈的东西";
        String maChang=ma.replace("妈","*");
        String maChang1=maChang.replace("操","*");
        System.out.println(maChang1);



    }
}
