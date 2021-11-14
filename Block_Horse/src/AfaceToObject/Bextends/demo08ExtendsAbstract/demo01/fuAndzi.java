package AfaceToObject.Bextends.demo08ExtendsAbstract.demo01;

import AfaceToObject.Bextends.demo08ExtendsAbstract.demo01.fu;

/**
 * @author : Bojack
 * @date : Created in 20:23 2021.11.08
 */
public class fuAndzi extends fu {

    public fuAndzi(){
        System.out.println("子类构造方法");

    }

    @Override
    public void eat() {
        System.out.println("eat breakfast");
    }
}
