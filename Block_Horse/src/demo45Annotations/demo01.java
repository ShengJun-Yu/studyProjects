package demo45Annotations;

/**
 * @author : Bojack
 * @date : Created in 19:24 2022.03.10
 *  * JDK中预定义的一些注解
 *  * 		* @Override	：检测被该注解标注的方法是否是继承自父类(接口)的
 *  * 		* @Deprecated：该注解标注的内容，表示已过时
 *  * 		* @SuppressWarnings：压制警告
 *  *
 *  *
 */
@MyAnnot(age = 11, value = 11, p=enums.p1,ann01 = @MyAnnot01(e=1),ir=1)
@SuppressWarnings("All")
public class demo01 {
    @Override
    public String toString() {
        return super.toString();
    }
    @Deprecated
    public void show1(){
        System.out.println("已过时");
    }

    public void show2(){
        System.out.println("建议使用的版本");
    }
    public void thisis(){
        show1();
    }

}
