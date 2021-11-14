package demo03Random;

import java.util.Random;

/**
 * @author : Bojack
 * @date : 2021Äê10ÔÂ12ÈÕ20:05:38
 */
public class Random02 {
    public static void main(String[] args) {
        Random num=new Random();
        for (int i = 0; i <=100; i++) {
            int n= num.nextInt(9);
            System.out.print(n+"|");
        }


    }
}
