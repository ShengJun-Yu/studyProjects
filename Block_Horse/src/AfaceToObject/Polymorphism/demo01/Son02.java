package AfaceToObject.Polymorphism.demo01;

/**
 * @author : Bojack
 * @date : Created in 14:56 2021.11.14
 */
public class Son02 extends Father{
    int num =40;
    public void method(){
        System.out.println("子类02重写方法");
    }
    public void methodSon(){
        System.out.println("子类02独有方法");
    }
}
