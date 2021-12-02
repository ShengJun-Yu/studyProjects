package demo28Collections.Sort;

/**
 * @author : Bojack
 * @date : Created in 21:13 2021.12.02
 */
public class Person implements Comparable<Person>{
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
//        return 0;  //认为元素都是相同的
//        //自定义比较的规则,比较两个人的年龄(this,参数Person)
//        //return o.getAge() - this.getAge();//年龄降序排序
        return this.getAge()-o.getAge();
    }
}
