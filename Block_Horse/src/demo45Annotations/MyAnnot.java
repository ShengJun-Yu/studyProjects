package demo45Annotations;

/**
 * @author : Bojack
 * @date : Created in 19:32 2022.03.10
 */
public @interface MyAnnot {
    //    基本数据类型
    int age();

    //如果只有一个属性需要赋值，而且属性名字为value，那么value可以不写，
    int value();

    //String 类型
//default,默认给name赋值为dwe使用时可以不进行赋值，
    String name() default "dwe";

    //枚举类型
    enums p();

    //注解类型
    MyAnnot01 ann01();

    //    数组类型,如果数组只有一个那么可以不写{}
    int[] ir();
}