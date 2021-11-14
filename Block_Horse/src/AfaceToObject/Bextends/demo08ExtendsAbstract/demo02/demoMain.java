package AfaceToObject.Bextends.demo08ExtendsAbstract.demo02;

/**
 * @author : Bojack
 * @date : Created in 20:41 2021.11.08
 */
public class demoMain {
    public static void main(String[] args) {
        DogTudog tudog=new DogTudog();
        tudog.eat();
        tudog.sleep();
        System.out.println("=======================");

        DogKeji Keji=new DogKeji();
        Keji.eat();
        Keji.sleep();

    }
}
