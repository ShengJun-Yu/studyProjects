package Algorithm.Recursive_Apple;

public class Hannoi {
    public static int sum=0;
    public static void main(String[] args) {
        hanoi(3,"A","B","C");
        System.out.println("总次数："+sum);
    }
    public static void hanoi(int n , String a, String b, String c) {
        //n代表一共有几个圆盘，abc表示三个柱子其中把a上圆盘移动到c上。
        if (n == 1) {
            System.out.print(a + "-->" + c+"|");
            sum += 1;//次数加1
        } else {
            hanoi(n - 1, a, c, b);
            System.out.print(a + "-->" + c+"|");
            sum += 1;//次数加1
            hanoi(n - 1, b, a, c);
        }
    }
}




