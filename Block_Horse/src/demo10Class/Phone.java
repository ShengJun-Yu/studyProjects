package demo10Class;

/**
 * @author : Bojack
 * @date : 2021��10��4��17:48:15
 */
public class Phone {
    public static void main(String[] args) {
        phonePractise sj=new phonePractise();
        sj.brand="С��";
        sj.color="�ǿպ�";
        sj.price=1999;
        System.out.println(sj.brand);
        System.out.println(sj.color);
        System.out.println(sj.price);

        sj.sendmessage();
        sj.call("stephen");
    }
}
