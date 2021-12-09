package AfaceToObject.Cpolymorphism.demo02;

/**
 * @author : Bojack
 * @date : Created in 15:57 2021.11.14
 * 向上转型一定是安全的，没有问题的，正确的。但是也有一个弊端：
 * 对象一旦向上转型为父类，那么就无法调用子类原本特有的内容。
 * <p>
 * 解决方案：用对象的向下转型【还原】。
 */
public class Multi01 {
    public static void main(String[] args) {
        // 对象的向上转型，就是：父类引用指向之类对象。
        Animal animal = new Cat(); // 本来创建的时候是一只猫
        animal.eat();

//        用对象的向下转型【还原】
        Dog dog =(Dog)animal;
        dog.eatShit();

//        Cat cat=(Cat)animal;//ClassCastException


    }
}
