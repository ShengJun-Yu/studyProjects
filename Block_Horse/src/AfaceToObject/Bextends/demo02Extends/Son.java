package AfaceToObject.Bextends.demo02Extends;

/**
 * @author : Bojack
 * @date : 2021年10月27日19:38:51
 */
public class Son extends Father{
    String snum="son";
    String num="son";

    public void Smethod() {
        System.out.println("子类执行了"+num);
        System.out.println("子类执行了"+fnum);
    }
}
