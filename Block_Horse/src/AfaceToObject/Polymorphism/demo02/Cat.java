package AfaceToObject.Polymorphism.demo02;

/**
 * @author : Bojack
 * @date : Created in 16:15 2021.11.14
 */
public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("Cat≥‘”„");
    }
    public void eatMouse() {
        System.out.println("Cat≥‘mouse");
    }
}
