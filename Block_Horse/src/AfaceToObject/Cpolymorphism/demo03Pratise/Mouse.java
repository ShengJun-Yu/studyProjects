package AfaceToObject.Cpolymorphism.demo03Pratise;

/**
 * @author : Bojack
 * @date : Created in 17:21 2021.11.14
 */
public class Mouse implements USB {

    @Override
    public void open() {
        System.out.println("鼠标打开");
    }

    @Override
    public void close() {
        System.out.println("鼠标关闭");
    }

    public void click() {
        System.out.println("鼠标点击");
    }
}
