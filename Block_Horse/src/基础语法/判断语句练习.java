package 基础语法;

/**
 * @author : Bojack
 * @date : 2021年9月19日20:49:05
 */
public class 判断语句练习 {
    public static void main(String [] args){
        int score=113;
        if (score<=100&&score>=90){
            System.out.println("你的成绩很优秀");
        }else if(score<89&&score>=80){
            System.out.println("你的成绩很好");
        }else if (score<79&&score>=70){
            System.out.println("你的成绩为良");
        }else if(score<=69&&score>60){
            System.out.println("你的成绩为及格");
        }else if(score>=0&&score<60){
            System.out.println("你的成绩不及格！请补考！");
        }else{
            System.out.println("数据错误");
        }
    }
}
