package AfaceToObject.Polymorphism.demo03Pratise;

/**
 * @author : Bojack
 * @date : Created in 17:21 2021.11.14
 */
public class Keyboard implements USB{

    @Override
    public void open() {
        System.out.println("¼üÅÌ´ò¿ª");
    }

    @Override
    public void close() {
        System.out.println("¼üÅÌ¹Ø±Õ");
    }
    public void type() {
        System.out.println("¼üÅÌÊäÈë");
    }
}
