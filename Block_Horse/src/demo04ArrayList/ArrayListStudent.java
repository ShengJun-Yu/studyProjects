package demo04ArrayList;

import java.util.ArrayList;

/**
 * @author : Bojack
 * @date : 2021年10月13日21:15:15
 * 题目：
 * 自定义4个学生对象，添加到集合，并遍历。
 * <p>
 * 思路：
 * 1. 自定义Student学生类，四个部分。
 * 2. 创建一个集合，用来存储学生对象。泛型：<Student>
 * 3. 根据类，创建4个学生对象。
 * 4. 将4个学生对象添加到集合中：add
 * 5. 遍历集合：for、size、get
 */
public class ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        Student stu=new Student("Stephen",18);
        Student stu1=new Student("Bojack",28);
        Student stu2=new Student("Jack",38);
        Student stu3=new Student("Nana",25);
        list.add(stu);
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        for (int i = 0; i < list.size(); i++) {
            Student per= list.get(i);
            System.out.println("姓名为"+per.getName()+"年龄为"+per.getAge());
        }

    }
}
