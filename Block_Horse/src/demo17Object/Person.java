package demo17Object;

import java.util.Objects;

/**
 * @author : Bojack
 * @date : Created in 19:57 2021.11.19
 */
public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*
        Object类的equals方法,默认比较的是两个对象的地址值,没有意义
        所以我们要重写equals方法,比较两个对象的属性(name,age)
        问题:
            隐含着一个多态
            多态的弊端:无法使用子类特有的内容(属性和方法)
            Object obj = p2 = new Person("古力娜扎",19);
            解决:可以使用向下转型(强转)把obj类型转换为Person
     */
//    @Override
//    public boolean equals(Object o) {
//        //判断传递的参数o如果是null,直接返回false,提高程序的效率
//        if (o == null) {
//            return false;
//        }
//        //判断传递参数o如果是自己，直接返回false,提高程序的效率
//        if (o == this) {
//            return true;
//        }
//        if (o instanceof Person) {
//            Person p = (Person) o;//向下转型为子类Person
//            boolean b = p.equals(this.name) && ((Person) o).age == this.age;
//            return b;
//        }
//        return false;
//    }
        @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        //getClass() != o.getClass() 使用反射技术,判断o是否是Person类型  等效于 obj instanceof Person
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {//覆盖重写toString方法
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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
