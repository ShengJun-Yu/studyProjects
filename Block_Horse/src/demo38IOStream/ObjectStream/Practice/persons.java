package demo38IOStream.ObjectStream.Practice;

import demo38IOStream.ObjectStream.Person;

import java.io.Serializable;

/**
 * @author : Bojack
 * @date : Created in 12:32 2022.02.25
 */
public class persons implements Serializable {
    private String name ;
    private int age ;
    private Person namage;

    @Override
    public String toString() {
        return "persons{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", namage=" + namage +
                '}';
    }

    public persons() {
    }

    public persons(String name, int age, Person namage) {
        this.name = name;
        this.age = age;
        this.namage = namage;
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

    public Person getNamage() {
        return namage;
    }

    public void setNamage(Person namage) {
        this.namage = namage;
    }
}
