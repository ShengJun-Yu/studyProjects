package demo05String;

/**
 * @author : Bojack
 * @date : 2021年10月16日15:23:50
 * 字符串的截取方法：
 *
 * public String substring(int index)：截取从参数位置一直到字符串末尾，返回新字符串。
 * public String substring(int begin, int end)：截取从begin开始，一直到end结束，中间的字符串。
 * 备注：[begin,end)，包含左边，不包含右边。
 */
public class SubString {
    public static void main(String[] args) {
        //public String substring(int index)：截取从参数位置一直到字符串末尾，返回新字符串。
        String str="Hello World";
        String str1=str.substring(2);
        System.out.println(str1);
        // public String substring(int begin, int end)：截取从begin开始，一直到end结束，中间的字符串。
        String str2=str.substring(2,4);
        System.out.println(str2);
    }
}
