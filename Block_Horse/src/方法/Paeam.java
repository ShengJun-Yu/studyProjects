package 方法;

/**
 * @author : Bojack
 * @date : 2021年9月22日19:58:34
 * 有参数:小括号内有内容，当一个方法需要数据条件，才能完成任务的时候就是有参数。
 * <p>
 * 无参数：小括号留空，一个方法不需要任何数据条件就可完成任务
 */
public class Paeam {
    public static void main(String[] args) {
        ji(33, 44);
        out();
    }

    public static int ji(int a, int b) {
        int ji = a * b;
        System.out.println(ji);
        return ji;
    }
    public static void out(){
        for(int i=0;i<10;i++){
            System.out.println("hello xinguo!");
        }
    }
}
