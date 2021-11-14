package AfaceToObject.Bextends.demo04ExtendsOverride;

/**
 * @author : Bojack
 * @date :
 */
public class phoenUse {
    public static void main(String[] args) {
        phone Phone =new phone();
        Phone.call();
        Phone.send();
        Phone.show();

        phoneNew PhoneNew=new phoneNew();
        Phone.show();
    }
}
