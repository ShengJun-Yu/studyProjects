package demo10Class;

/**
 * @author : Bojack
 * @date : 2021��10��11��19:26:05
 */
public class classNormUse {
    public static void main(String[] args) {
        classNorm stu = new classNorm("��ʢ��", 21, false);
        System.out.println("name is" + stu.getName() + "age is" + stu.getAge() + "Sex is man?" + stu.isIsman());
        stu.setAge(23);
        System.out.println("name is" + stu.getName() + "age is" + stu.getAge() + "Sex is man?" + stu.isIsman());

    }
}
