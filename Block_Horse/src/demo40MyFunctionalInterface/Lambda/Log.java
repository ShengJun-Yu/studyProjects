package demo40MyFunctionalInterface.Lambda;

/**
 * @author : Bojack
 * @date : Created in 19:19 2022.02.27
 *  日志案例
 *
 *     发现以下代码存在的一些性能浪费的问题
 *     调用showLog方法,传递的第二个参数是一个拼接后的字符串
 *     先把字符串拼接好,然后在调用showLog方法
 *     showLog方法中如果传递的日志等级不是1级
 *     那么就不会是如此拼接后的字符串
 *     所以感觉字符串就白拼接了,存在了浪费
 */
public class Log {
    public static void showlog(int level,String logthing){
        if (level==1){
            System.out.println(logthing);
        }
    }

    public static void main(String[] args) {
        String one="hello";
        String two="World";
        String three="C++";
        showlog(2,one+two+three);
    }
}
