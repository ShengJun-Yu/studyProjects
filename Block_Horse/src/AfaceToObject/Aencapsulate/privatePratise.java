package AfaceToObject.Aencapsulate;

/**
 * @author : Bojack
 * @date : 2021年10月9日21:23:04
 * 对于基本类型当中的boolean值，Getter方法一定要写成isXxx的形式，而setXxx规则不变。
 */
public class privatePratise {
    private int age;
    private String name;
    private boolean man;

    public void setMan(boolean y) {
        man = y;
    }
    public boolean isMan(){
        return man;
    }

    public void setAge(int num) {
        age = num;
    }

    public int getAge() {
        return age;
    }

    public void setName(String min) {
        name = min;
    }

    public String getName() {
        return name;
    }

}

