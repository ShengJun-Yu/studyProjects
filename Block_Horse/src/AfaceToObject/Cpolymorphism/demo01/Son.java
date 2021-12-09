package AfaceToObject.Cpolymorphism.demo01;

/**
 * @author : Bojack
 * @date : Created in 14:56 2021.11.14
 */
public class Son extends Father{
    int num =20;
    public void method(){
        System.out.println("子类重写方法");
    }
    public void methodSon(){
        System.out.println("子类独有方法");
    }
}
