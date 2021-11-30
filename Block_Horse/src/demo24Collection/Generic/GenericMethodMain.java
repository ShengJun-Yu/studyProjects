package demo24Collection.Generic;

/**
 * @author : Bojack
 * @date : Created in 21:13 2021.11.30
 */
public class GenericMethodMain {
    public static void main(String[] args) {
        GenericMethod ge=new GenericMethod();
        ge.method01("Hello World");
        ge.method01(123);

        //静态方法
        ge.method02(31);
        ge.method02("“分数高”");
    }
}
