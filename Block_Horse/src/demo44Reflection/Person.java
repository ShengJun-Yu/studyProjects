package demo44Reflection;

/**
 * @author : Bojack
 * @date : Created in 18:19 2022.03.09
 */
public class Person {
    private String name ;
    private int age;
    public  String a;
    public String b;
    public String c;
    public String d;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                ", d='" + d + '\'' +
                '}';
    }
    public void eat(){
        System.out.println("eat...");
    }
    public void eat(String food){
        System.out.println("eat."+food);
    }
}
