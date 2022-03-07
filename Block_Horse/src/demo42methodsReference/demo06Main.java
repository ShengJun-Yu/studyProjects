package demo42methodsReference;

/**
 * @author : Bojack
 * @date : Created in 20:17 2022.03.07
 *     类的构造器(构造方法)引用
 */
public class demo06Main {
    public static void show1(String p,demo06Interface i){
        demo06Person person = i.show(p);
        System.out.println(person);
    }

    public static void main(String[] args) {
//        show1("ysj",(name)-> new demo06Person(name));
          /*
            使用方法引用优化Lambda表达式
            构造方法new Person(String name) 已知
            创建对象已知 new
            就可以使用Person引用new创建对象
         */
        show1("ysj",demo06Person::new);

    }
}
