package AfaceToObject.Cpolymorphism.demo02;

/**
 * @author : Bojack
 * @date : Created in 16:28 2021.11.14
 * 如何才能知道一个父类引用的对象，本来是什么子类？
 * 格式：
 * 对象 instanceof 类名称
 * 这将会得到一个boolean值结果，也就是判断前面的对象能不能当做后面类型的实例。
 */
public class MultiInstanceof {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();
        System.out.println(animal instanceof Dog);
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.eatMouse();
        }
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.eatShit();
        }
        pet(new Cat());
    }

    public static void pet(Animal animal) {
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.eatMouse();
        }
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.eatShit();
        }
    }
}
