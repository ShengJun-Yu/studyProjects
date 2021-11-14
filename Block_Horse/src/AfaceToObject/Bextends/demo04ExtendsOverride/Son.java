package AfaceToObject.Bextends.demo04ExtendsOverride;



/**
 * @author : Bojack
 * @date : 2021年10月27日20:35:13
 */
public class Son extends Father {
    //@Override：写在方法前面，用来检测是不是有效的正确覆盖重写。
    @Override
    public String methed(){
        System.out.println("子类方法执行了");
        return null;
    }
}
