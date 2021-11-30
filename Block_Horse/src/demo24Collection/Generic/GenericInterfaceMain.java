package demo24Collection.Generic;

/**
 * @author : Bojack
 * @date : Created in 21:34 2021.11.30
 * 含泛型的接口测试
 */
public class GenericInterfaceMain {
    public static void main(String[] args) {
        //创建GenericInterfaceImpl01
        GenericInterfaceImpl01 impl01=new GenericInterfaceImpl01();
        impl01.method("edw");
        //创建GenericInterfaceImpl2对象 可只有指定数据类型
        GenericInterfaceImpl02<Integer> impl02=new GenericInterfaceImpl02<>();
        impl02.method(123);

        GenericInterfaceImpl02<String> impl03=new GenericInterfaceImpl02<>();
        impl02.method("JUN");


    }


}
