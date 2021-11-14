package demo06Static;

/**
 * @author : Bojack
 * @date : 2021年10月18日21:38:18
 *  * 静态代码块的格式是：
 *  *
 *  * public class 类名称 {
 *  *     static {
 *  *         // 静态代码块的内容
 *  *     }
 *  * }
 *  *
 */
public class Static {
    static {
        System.out.println("静态方法运行中！");
    }
    public void Static(){
        System.out.println("构造方法运行中！");
    }
}
