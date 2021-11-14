package 基础语法;


/**
 * @author : Bojack
 * @date : 2021年9月21日19:33:27
 */
public class 选择语句 {
    public static void main(String[] args) {
        b();
    }

    /**
     * 选择语句 switch
     * 注意！！！
     * 1.case后数据不可以重复
     * 2.switch后只能接
     * 基础数据： byte  short  char int
     * 引用数据： String字符串，enum枚举
     * 3.switch 语句格式非常灵活： 前后顺序可以颠倒，break语句可以省略
     */
    public static void b() {
        int num = 33;
        switch (num) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期天");
                break;
            default:
                System.out.println("数据错误");
                break;
        }
    }

}

