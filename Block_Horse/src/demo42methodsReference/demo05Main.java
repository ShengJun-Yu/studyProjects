package demo42methodsReference;

/**
 * @author : Bojack
 * @date : Created in 19:58 2022.03.07
 *  使用this引用本类的成员方法
 */
public class demo05Main {
    public void buyhouse() {
        System.out.println("买铂金300kg");
    }

    public void marry(demo05Interface d) {
        d.buy();
    }

    public void happy() {
//        marry(() -> {
//            this.buyhouse();
//   d});
        /*
            使用方法引用优化Lambda表达式
            this是已经存在的
            本类的成员方法buyHouse也是已经存在的
            所以我们可以直接使用this引用本类的成员方法buyHouse
         */
        marry(this::buyhouse);
    }


    public static void main(String[] args) {
        new demo05Main().happy();
    }
}
