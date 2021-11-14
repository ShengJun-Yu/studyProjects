package demo06Static;

/**
 * @author : Bojack
 * @date :2021年10月18日20:03:53
 * 如果一个成员变量使用了static关键字，那么这个变量不再属于对象自己，而是属于所在的类。多个对象共享同一份数据。
 */
public class StaticField {
    private int id;
    private String name;
    private int age;
    static String room;
    private static int idget = 0;

    public StaticField() {

    }

    public StaticField(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idget;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}