package demo05String;

/**
 * @author : Bojack
 * @date : 2021年10月16日15:07:27
 * String当中与获取相关的常用方法有：
 *
 * public int length()：获取字符串当中含有的字符个数，拿到字符串长度。
 * public String concat(String str)：将当前字符串和参数字符串拼接成为返回值新的字符串。
 * public char charAt(int index)：获取指定索引位置的单个字符。（索引从0开始。）
 * public int indexOf(String str)：查找参数字符串在本字符串当中首次出现的索引位置，如果没有返回-1值。
 */
public class StringGet {
    public static void main(String[] args) {
        // public int length()：获取字符串当中含有的字符个数，拿到字符串长度。
        String str="gyughieruhuirewgiruewuir";
        int lenght=str.length();
        System.out.println(lenght);

        // public String concat(String str)：将当前字符串和参数字符串拼接成为返回值新的字符串。
        String str1=new String("hello");
        System.out.println(str1);
        String str2=str1.concat(str);
        System.out.println(str2);

        //public char charAt(int index)：获取指定索引位置的单个字符。（索引从0开始。）
        String name="Stephen";
        char str5=name.charAt(1);
        System.out.println(str5);

        // public int indexOf(String str)：查找参数字符串在本字符串当中首次出现的索引位置，如果没有返回-1值。
        String name1 ="StephenYuyyuShengJun";
        int num=name1.indexOf("y");
        int num2=name1.indexOf("z");

        System.out.println(num);
        System.out.println(num2);

    }
}
