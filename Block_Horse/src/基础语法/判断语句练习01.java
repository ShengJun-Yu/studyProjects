package �����﷨;

/**
 * @author : Bojack
 * @date : 2021��9��19��21:00:11
 */
public class �ж������ϰ01 {
    public static void main(String[] args){
        int a=220;
        int b=220;
        int max;
        //��Ԫ�����ʵ��
        max=a > b ? a : b;
        System.out.println("���ֵΪ"+max);
        //if ���ʵ��
        if(a>b){
            max=a;
        }else if(a>b){
            max=b;
        }else{
            System.out.println("���");
        }
        System.out.println("���ֵΪ"+max);
    }
}
