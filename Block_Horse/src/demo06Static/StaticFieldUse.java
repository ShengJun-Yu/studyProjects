package demo06Static;

/**
 * @author : Bojack
 * @date : 2021年10月18日20:30:40
 */
public class StaticFieldUse {
    public static void main(String[] args) {


        StaticField one = new StaticField("Stephen ", 18);
        StaticField two = new StaticField("Bojack ", 19);
        StaticField three = new StaticField("Cete ", 28);
        StaticField.room = "101教室";
        System.out.println("name is:" + one.getName() + "!age is:" + one.getAge()
                + "!Class room is:" +StaticField.room+ "!Id is"+one.getId());
        System.out.println("name is:" + two.getName() + "!age is:" + two.getAge()
                + "!Class room is:" + StaticField.room+  "!Id is"+two.getId());
        System.out.println("name is:" + three.getName() + "!age is:" + three.getAge()
                + "!Class room is:" + new StaticField().room+ "!Id is"+ three.getId());
    }


}
