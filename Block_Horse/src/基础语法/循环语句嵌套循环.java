package 基础语法;

/**
 * @author : Bojack
 * @date : 2021年9月21日21:36:14
 */
public class 循环语句嵌套循环 {
    public static void main(String[] args) {
        a();
    }

    public static void a() {
        for (int i = 0; i < 24; i++) {//小时
            for (int min = 0; min < 60; min++) {//分钟
                for (int sto = 0; sto < 60; sto++) {//秒
                    System.out.println(i + "点：" + min + "分钟：" + sto + "秒");
                }

            }
        }
    }
}
