package 基础语法;
/**
 * @author : Bojack
 * @date : 2021年9月21日19:34:09
 * 循环语句分四步
 * 1.初始化语句：在循环开始只做唯一一次
 * 2.条件判断：成立继续，不成立退出循环
 * 3.循环体：重复的内容
 * 4.步进语句：循环后的扫尾工作！！！每次循环后都要执行一次！！！
 */
public class 循环语句 {
    public static void main(String[] args) {
        a();
        b();
        c();
    }
    /**
     * 循环语句 --for
     *for (初始化语句; 条件判断; 步进语句）{
     *     循环体;
     *}
     */
    public static void a(){
        for(int a=0;a<=9;a++){
            System.out.println(a+"你错了！");
        }
        System.out.println("for程序停止");
    }
    /**
     * 循环语句 --while
     * 标准格式：
     * while（条件判断）{
     *     循环体;
     * }
     * 拓展格式：
     * 初始化语句;
     * while（条件判断）{
     *     循环体;
     *     步进语句;
     * }
     */
    public static void b(){
        int i=1;
        while(i<=8){
            System.out.println(i+"Fuck");
            i++;
        }
        System.out.println("while程序停止");
    }
    /**
     * 循环语句 --do...while
     * 标准格式
     *
     * do{
     *     循环体;
     *  }while(条件判断);
     *
     *  拓展格式：
     *
     *  初始化语句;
     *  do{
     *      循环体;
     *      步进语句;
     *  }while(条件判断）;
     */
    public static void c(){
        int b=1;
        do{
            System.out.println(b+"hello");
            b++;
        }while(b<=6);
        System.out.println("do...while程序结束");
    }

}
