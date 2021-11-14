package AfaceToObject.Bextends.demo09ExtendsPratise;

import demo04ArrayList.ArrayList01;

import java.util.ArrayList;

/**
 * @author : Bojack
 * @date : Created in 21:54 2021.11.08
 */
public class MainPratise {
    public static void main(String[] args) {
        Messager messager = new Messager("Boss", 2000);

        Member one = new Member("Stephen", 0);
        Member two = new Member("Cete", 0);
        Member three = new Member("Bojack", 0);

        messager.show();
        one.show();
        two.show();
        three.show();
        System.out.println("================================");

        ArrayList<Integer> list = messager.send(200, 3);
        one.receive(list);
        two.receive(list);
        three.receive(list);

        messager.show();
        one.show();
        two.show();
        three.show();

    }
}
