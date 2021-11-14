package 基础语法;

/**
 * @author : Bojack
 * @date : 2021年9月19日21:00:11
 */
public class 判断语句练习01 {
    public static void main(String[] args){
        int a=220;
        int b=220;
        int max;
        //三元运算符实现
        max=a > b ? a : b;
        System.out.println("最大值为"+max);
        //if 语句实现
        if(a>b){
            max=a;
        }else if(a>b){
            max=b;
        }else{
            System.out.println("相等");
        }
        System.out.println("最大值为"+max);
    }
}
