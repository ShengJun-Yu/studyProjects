package demo40MyFunctionalInterface.Lambda;

/**
 * @author : Bojack
 * @date : Created in 19:19 2022.02.27
 *    ʹ��Lambda�Ż���־����
 *     Lambda���ص�:�ӳټ���
 *     Lambda��ʹ��ǰ��,������ں���ʽ�ӿ�
 */
public class LogBetterLambda {
    public static void showlog(int level,Myinterface myinterface){
        if (level==1){
            System.out.println(myinterface.stringBuilder());
        }
    }

    public static void main(String[] args) {
        String one="hello";
        String two="World";
        String three="C++";
        showlog(1,()->{
            System.out.println("���Ѿ�ִ��lambda���ʽʵ�ֵĺ���ʽ�ӿڷ���");
            return one+two+three;
        });
    }
}
