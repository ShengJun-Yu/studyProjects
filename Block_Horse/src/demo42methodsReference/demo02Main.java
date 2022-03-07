package demo42methodsReference;

/**
 * @author : Bojack
 * @date : Created in 18:54 2022.03.07
 * 通过对象名引用成员方法
 *     使用前提是对象名是已经存在的,成员方法也是已经存在
 *     就可以使用对象名来引用成员方法
 */
public class demo02Main {
    public static void pr(AInterface d){
        d.printlns("hello,world");
    }
    public static void main(String[] args) {
        pr((name)->{
            demo02 de=new demo02();
            de.bigprint(name);
        });
 /*
            使用方法引用优化Lambda
            对象是已经存在的demo02
            成员方法也是已经存在的bidprint
            所以我们可以使用对象名引用成员方法
         */
        demo02 dee=new demo02();
        pr(dee::bigprint);
    }
}
