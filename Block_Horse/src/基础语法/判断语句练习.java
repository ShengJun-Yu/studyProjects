package �����﷨;

/**
 * @author : Bojack
 * @date : 2021��9��19��20:49:05
 */
public class �ж������ϰ {
    public static void main(String [] args){
        int score=113;
        if (score<=100&&score>=90){
            System.out.println("��ĳɼ�������");
        }else if(score<89&&score>=80){
            System.out.println("��ĳɼ��ܺ�");
        }else if (score<79&&score>=70){
            System.out.println("��ĳɼ�Ϊ��");
        }else if(score<=69&&score>60){
            System.out.println("��ĳɼ�Ϊ����");
        }else if(score>=0&&score<60){
            System.out.println("��ĳɼ��������벹����");
        }else{
            System.out.println("���ݴ���");
        }
    }
}
