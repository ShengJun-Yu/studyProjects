package AfaceToObject.Aencapsulate;

/**
 * @author : Bojack
 * @date : 2021年10月10日16:52:09
 * 当方法的局部变量和方法的成员变量重名时，根据就近原则优先使用局部变量
 * 若想要访问本类中的成员变量，需要使用this关键字
 * this.成员变量
 */
public class thisPerson {
    String name;

    public void sayhello(String name) {
        System.out.println(name + "你好，我是" + this.name);
    }
}
