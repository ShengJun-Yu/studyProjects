package AfaceToObject.Bextends.demo05ExtendsConstructor;

/**
 * @author : Bojack
 * @date : 2021年10月27日21:24:28
 */
public class son extends father{
    public son(){
        super();
        System.out.println("子类构造方法执行了");
    }
    public void methed(){
//        super();错误写法！只有子类构造方法，才能调用父类构造方法。

    }
}
