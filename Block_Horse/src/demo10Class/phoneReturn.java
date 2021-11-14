package demo10Class;

/**
 * @author : Bojack
 * @date : 2021Äê10ÔÂ9ÈÕ19:49:49
 */

public class phoneReturn {
    public static void main(String[] args) {
        phonePractise two=getPhone();
        System.out.println(two.brand);
        System.out.println(two.price+"$");
        System.out.println(two.color);

        
    }
    public static phonePractise getPhone(){
        phonePractise one=new phonePractise();
        one.brand="Apple";
        one.color="red";
        one.price=9999;
        return one;
    }

}
