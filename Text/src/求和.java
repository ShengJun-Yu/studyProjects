/**
 * @author : Bojack
 * @date : 2021年9月22日17:27:07
 */
import java.util.Scanner;
public class 求和 {
    public static void main(String[] args) {
        int sum=0;
        System.out.println("请输入要计算的数字");
        Scanner c=new Scanner(System.in);
        int a=c.nextInt();
        for (int i = 0; i <= a; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
//    public static int sum(int a){
//        for(int i = 0; i<=a; i++) {
//            int b = 0;
//            int soum = b + i;
//        }
//        return soum;
//    }
    }
}

