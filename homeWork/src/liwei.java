/**
 * @author : Bojack
 * @date : 2021��9��23��11:43:42
 */
public class liwei {
    public static void main(String[] args) {
        Animal x=new Cat();
        x.Say();

    }

}
class Person{
    public void Drive(Animal x){
        x.Say();
    }
//    public void Drive(Cat x){
//        x,say();
//    }
//    public void Drive(Dag x){
//        x,say();
//    }
}

class Animal {
    public void Say() {
        System.out.println("��");
    }
}

class Cat extends Animal {
        public void Say() {
            System.out.println("������");
        }
}
