package demo04ArrayList;

import java.util.ArrayList;

/**
 * @author : Bojack
 * @date : 2021��10��13��20:36:51
 */
public class ArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<>();
        list.add("Stephen");
        list.add("Bojack");
        list.add("Jack");
        list.add("Cete");
        list.add("Nana");

        //���������б�
        for (int i = 0; i < list.size(); i++) {
            System.out.println("�����"+i+"Ԫ��Ϊ"+list.get(i));
        }

    }
}
