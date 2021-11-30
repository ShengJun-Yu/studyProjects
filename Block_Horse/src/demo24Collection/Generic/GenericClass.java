package demo24Collection.Generic;

/**
 * @author : Bojack
 * @date : Created in 20:59 2021.11.30
 *     定义一个含有泛型<E>的类,模拟ArrayList集合
 *     泛型是一个未知的数据类型,当我们不确定什么什么数据类型的时候,可以使用泛型
 *     泛型可以接收任意的数据类型,可以使用Integer,String,Student...
 *     创建对象的时候确定泛型的数据类型
 */
public class GenericClass<E> {
    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
