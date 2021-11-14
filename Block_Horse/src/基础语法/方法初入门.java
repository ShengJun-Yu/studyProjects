package 基础语法;

/**
 * @author : Bojack
 * @date : 2021年9月19日19:11:37
 */

/**
 * public static void 方法名（）{
 * 方法体
 * }
 * 注意！！！
 * 1.方法定义先后顺序无所谓
 * 2、方法定义不可以嵌套
 * 3.方法定义好后需要【调用】才可执行
 */
public class 方法初入门 {
    public static void main(String[] args) {
        farmer();//调用farmer的方法 下同
        seller();
        cook();
        me();

    }

    public static void farmer() {
        System.out.println("育种");
        System.out.println("播种");
        System.out.println("开花");
        System.out.println("结果");
        System.out.println("收获");
        System.out.println("换钱");
    }

    public static void seller() {
        System.out.println("抬价");
        System.out.println("卖菜");
        System.out.println("给厨师");
    }

    public static void cook() {
        System.out.println("洗菜");
        System.out.println("炒菜");
        System.out.println("上菜");
    }

    public static void me() {
        System.out.println("吃");
    }
}
