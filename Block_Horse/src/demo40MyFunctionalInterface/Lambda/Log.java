package demo40MyFunctionalInterface.Lambda;

/**
 * @author : Bojack
 * @date : Created in 19:19 2022.02.27
 *  ��־����
 *
 *     �������´�����ڵ�һЩ�����˷ѵ�����
 *     ����showLog����,���ݵĵڶ���������һ��ƴ�Ӻ���ַ���
 *     �Ȱ��ַ���ƴ�Ӻ�,Ȼ���ڵ���showLog����
 *     showLog������������ݵ���־�ȼ�����1��
 *     ��ô�Ͳ��������ƴ�Ӻ���ַ���
 *     ���Ըо��ַ����Ͱ�ƴ����,�������˷�
 */
public class Log {
    public static void showlog(int level,String logthing){
        if (level==1){
            System.out.println(logthing);
        }
    }

    public static void main(String[] args) {
        String one="hello";
        String two="World";
        String three="C++";
        showlog(2,one+two+three);
    }
}
