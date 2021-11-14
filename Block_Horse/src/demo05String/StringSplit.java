package demo05String;

/**
 * @author : Bojack
 * @date : 2021年10月16日16:14:06
 * 分割字符串的方法：
 * public String[] split(String regex)：按照参数的规则，将字符串切分成为若干部分。
 * <p>
 * 注意事项：
 * split方法的参数其实是一个“正则表达式”，今后学习。
 * 今天要注意：如果按照英文句点“.”进行切分，必须写"\\."（两个反斜杠）
 */
public class StringSplit {
    public static void main(String[] args) {
        String str = "aaa/sss/ccc/e43/rfwfe/frw";
        String[] s = str.split("/");
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
        System.out.println("=====================");


        String str1 = "adre wrfe egt tg e tg eg erg ";
        String[] s1 = str1.split(" ");
        for (int i = 0; i < s1.length; i++) {
            System.out.println(s1[i]);
        }
        System.out.println("=====================");

        String str2 = "adre. wrfe. egt .tg. e.tg. eg. erg ";
        String[] s2 = str2.split("\\.");
        for (int i = 0; i < s2.length; i++) {
            System.out.println(s2[i]);
        }


    }
}
