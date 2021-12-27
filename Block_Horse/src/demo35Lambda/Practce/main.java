package demo35Lambda.Practce;

/**
 * @author : Bojack
 * @date : Created in 16:43 2021.12.27
 * Lambda表达式有参数有返回值的练习
 * 需求:
 * 给定一个计算器Calculator接口，内含抽象方法calc可以将两个int数字相加得到和值
 * 使用Lambda的标准格式调用invokeCalc方法，完成120和130的相加计算
 */
public class main {
    public static void main(String[] args) {
//        jias(10, 20, new Calculator() {
//            @Override
//            public int calu(int a, int b) {
//                return a+b;
//            }
//        });

//        lambda写法
        jias(20, 30, (int a, int b) -> {
            return a + b;
        });

    }

    public static void jias(int a, int b, Calculator c) {
        int sum = c.calu(a, b);
        System.out.println(sum);
    }

}
