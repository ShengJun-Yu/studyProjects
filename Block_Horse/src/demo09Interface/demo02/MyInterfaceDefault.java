package demo09Interface.demo02;

/**
 * @author : Bojack
 * @date : Created in 21:14 2021.11.09
 * 从Java 8开始，接口里允许定义默认方法。
 * 格式：
 * public default 返回值类型 方法名称(参数列表) {
 * 方法体
 * }
 * <p>
 * 备注：接口当中的默认方法，可以解决接口升级的问题。
 */
public interface MyInterfaceDefault {
    public abstract void methodsAbs();

    //    public abstract void methodsAbs1();
    public default void methodDefault() {
        System.out.println("接口当中的默认方法");
    }


}
