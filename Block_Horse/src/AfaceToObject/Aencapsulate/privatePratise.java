package AfaceToObject.Aencapsulate;

/**
 * @author : Bojack
 * @date : 2021��10��9��21:23:04
 * ���ڻ������͵��е�booleanֵ��Getter����һ��Ҫд��isXxx����ʽ����setXxx���򲻱䡣
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

