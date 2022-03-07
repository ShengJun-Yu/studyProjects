package demo42methodsReference;

/**
 * @author : Bojack
 * @date : Created in 19:47 2022.03.07
 */
public class demo04Son extends demo04Father {
    @Override
    public void say() {
        System.out.println("我是儿子");
    }

    public void method(demo04Interface d) {
        d.see();
    }

    public void show() {
//        method(() -> {
//            demo04Father father = new demo04Father();
//            father.say();
//        });
         /*
           使用super引用类的成员方法
           super是已经存在的
           父类的成员方法sayHello也是已经存在的
           所以我们可以直接使用super引用父类的成员方法
       */
        method(super::say);

    }

    public static void main(String[] args) {
        new demo04Son().show();
    }
}
