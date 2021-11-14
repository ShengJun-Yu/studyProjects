
public class Second_Homework {
    public static void main(String[] args) {
        String str = "qwertty";
        String str0 = "a";
        String str1 = " as ";
        String str2 = "d";
        String str3 = "g";
        String str4 = "x";
/**
 * 顺序串
 */
        System.out.println(str.charAt(1));//求pos位置的字符
        System.out.println(str.length());//获取字符串的长度
        System.out.println(str.substring(0, 2));//求子串
        System.out.println(str.contains(str1));//判断是否包含串str
        System.out.println(str2.equals(str3));//判断是否相等
        System.out.println(str1.trim());//去掉字符串首尾两端的空格
        for (int i = 0; i <= str.split(str0).length; i++) {
            System.out.println(str.charAt(i));
        }//字符串分割
/**
 * 链串
 */
        System.out.println(str.indexOf(str2)); //求串str的位置
        System.out.println(str.replace(str2, str4));//将串中包含的str1替换成str2
        System.out.println(str3.toLowerCase()); //转换成小写
        System.out.println(str3.toUpperCase());//转换成大写
        System.out.println(str3.concat(str4));//串连接
    }
}


