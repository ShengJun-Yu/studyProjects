package AfaceToObject.Bextends.demo03Extends;

/**
 * @author : Bojack
 * @date : 2021年10月27日19:58:20
 * 局部变量：         直接写成员变量名
 * 本类的成员变量：    this.成员变量名
 * 父类的成员变量：    super.成员变量名
 */
public class Son extends Father {
    String name = "son";

    public void smethed() {
        String name = "methed son";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
    //@Override：写在方法前面，用来检测是不是有效的正确覆盖重写。
    @Override
    public String methed(){
        System.out.println("子类方法执行了");
        return null;
    }
}
