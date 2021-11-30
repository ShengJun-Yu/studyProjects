package demo24Collection.Generic;

/**
 * @author : Bojack
 * @date : Created in 21:01 2021.11.30
 */
public class GenericClassMain {
    public static void main(String[] args) {
        GenericClass object=new GenericClass();
        object.setName(13);
        object.setName("edsc");
        Object name = object.getName();
        System.out.println(name);

        GenericClass<Integer> in=new GenericClass<>();
        in.setName(1);
        System.out.println(in.getName());

        GenericClass<String> st=new GenericClass<>();
        st.setName("Unall");
        System.out.println(st.getName());
    }
}
