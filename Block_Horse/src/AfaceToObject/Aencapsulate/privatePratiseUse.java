package AfaceToObject.Aencapsulate;

/**
 * @author : Bojack
 * @date : 2021年10月9日21:43:25
 */
public class privatePratiseUse {
    public static void main(String[] args) {
        privatePratise stu = new privatePratise();
        stu.setName("stepen");
        stu.setAge(33);
        stu.setMan(false);
        System.out.println("姓名：" + stu.getName());
        System.out.println("年龄：" + stu.getAge());
        System.out.println("是不是爷们儿：" + stu.isMan());

    }


}
