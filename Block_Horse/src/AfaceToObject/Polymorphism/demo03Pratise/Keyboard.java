package AfaceToObject.Polymorphism.demo03Pratise;

/**
 * @author : Bojack
 * @date : Created in 17:21 2021.11.14
 */
public class Keyboard implements USB{

    @Override
    public void open() {
        System.out.println("���̴�");
    }

    @Override
    public void close() {
        System.out.println("���̹ر�");
    }
    public void type() {
        System.out.println("��������");
    }
}
