package demo10Class;

/**
 * @author : Bojack
 * @date : 2021年10月4日17:48:15
 */
public class Phone {
    public static void main(String[] args) {
        phonePractise sj=new phonePractise();
        sj.brand="小米";
        sj.color="星空黑";
        sj.price=1999;
        System.out.println(sj.brand);
        System.out.println(sj.color);
        System.out.println(sj.price);

        sj.sendmessage();
        sj.call("stephen");
    }
}
