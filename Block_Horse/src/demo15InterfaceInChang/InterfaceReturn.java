package demo15InterfaceInChang;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Bojack
 * @date : Created in 21:09 2021.11.17
 */
public class InterfaceReturn {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        List<String> l=methods(list);
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
    }
    public static List<String> methods(List<String> list){
        list.add("Stephrn");
        list.add("Stwefhrn");
        list.add("Stewfehrn");
        list.add("Stefwephrn");
        return list;
    }
}
