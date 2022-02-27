package demo40MyFunctionalInterface.Lambda;

/**
 * @author : Bojack
 * @date : Created in 19:19 2022.02.27
 *    使用Lambda优化日志案例
 *     Lambda的特点:延迟加载
 *     Lambda的使用前提,必须存在函数式接口
 */
public class LogBetterLambda {
    public static void showlog(int level,Myinterface myinterface){
        if (level==1){
            System.out.println(myinterface.stringBuilder());
        }
    }

    public static void main(String[] args) {
        String one="hello";
        String two="World";
        String three="C++";
        showlog(1,()->{
            System.out.println("我已经执行lambda表达式实现的函数式接口方法");
            return one+two+three;
        });
    }
}
