package demo09Interface.demo03;

/**
 * @author : Bojack
 * @date : Created in 21:34 2021.11.09
 *  * 注意事项：不能通过接口实现类的对象来调用接口当中的静态方法。
 *  * 正确用法：通过接口名称，直接调用其中的静态方法。
 *  * 格式：
 *  * 接口名称.静态方法名(参数);
 */
public class Interface03 {
    public static void main(String[] args) {
//        通过接口名称调用接口放方法
        MyInterfaceStatic.methodStatic();

    }
}
