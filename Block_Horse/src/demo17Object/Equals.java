package demo17Object;

/**
 * @author : Bojack
 * @date : Created in 20:22 2021.11.19
 * Person类默认继承了Object类,所以可以使用Object类的equals方法
 * boolean equals(Object obj) 指示其他某个对象是否与此对象“相等”。
 * equals方法源码:
 * public boolean equals(Object obj) {
 * return (this == obj);
 * }
 * 参数:
 * Object obj:可以传递任意的对象
 * == 比较运算符,返回的是一个布尔值 true false
 * 基本数据类型:比较的是值
 * 引用数据类型:比价的是两个对象的地址值
 * this是谁?那个对象调用的方法,方法中的this就是那个对象;person1调用的equals方法所以this就是person1
 * obj是谁?传递过来的参数person2
 * this==obj -->person1==person2
 */
public class Equals {
    public static void main(String[] args) {
        Person person1 = new Person("Bojack", 19);
        Person person2 = new Person("Bojack", 19);
        boolean y = person1.equals(person2);
        System.out.println(y);
    }
}
