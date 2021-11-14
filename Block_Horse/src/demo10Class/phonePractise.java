package demo10Class;

/**
 * @author : Bojack
 * @date : 2021年10月4日17:36:34
 */
public class phonePractise {
    String brand;
    int price;
    String color;

    public void call(String who) {
        System.out.println("给" + who + "打电话");
    }

    public void sendmessage() {
        System.out.println("发信息");
    }
}
