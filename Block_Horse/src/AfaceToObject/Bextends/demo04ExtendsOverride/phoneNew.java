package AfaceToObject.Bextends.demo04ExtendsOverride;

/**
 * @author : Bojack
 * @date : 2021��10��27��20:52:33
 */
public class phoneNew extends phone {
    @Override
    public void show(){
        super.show();
        System.out.println("Show name");
        System.out.println("Show Picture");
    }

}
