package AfaceToObject.Polymorphism.demo01;

/**
 * @author : Bojack
 * @date : Created in 14:56 2021.11.14
 */
public class Father {
    int num =10;
    public void method(){
        System.out.println("父类方法");
    }
    public void methodFather(){
        System.out.println("父类独有方法");
    }
    public void methodFather01(){
        System.out.println(num);
    }
}
