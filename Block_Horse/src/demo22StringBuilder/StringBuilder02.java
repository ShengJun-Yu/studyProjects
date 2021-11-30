package demo22StringBuilder;

/**
 * @author : Bojack
 * @date : Created in 19:16 2021.11.25
 * StringBuilder�ĳ��÷���:
 * public StringBuilder append(...)����������������ݵ��ַ�����ʽ�������ص�ǰ��������
 * public StringBuilder reverse(...);   ���¸��ַ����б����е��෴���档
 * public String toString()���ر�ʾ��˳���е����ݵ��ַ�����
 */
public class StringBuilder02 {
    public static void main(String[] args) {
        StringBuilder st = new StringBuilder();
        StringBuilder st1 = st.append(12);
        System.out.println(st == st1);//true
        System.out.println(st);
         /*
            public StringBuilder append(...)����������������ݵ��ַ�����ʽ�������ص�ǰ��������
            append�������ص�Ϊ��ǰ��������
            ��ʽ���:��������ֵ��һ������,���Լ������÷���
         */
        st.append(31).append("ftftft").append("��β");
        System.out.println(st);
         /*
             public StringBuilder reverse(...);   ���¸��ַ����б����е��෴���档
          */
        st.reverse();
        System.out.println(st);
        System.out.println("=================");
        /*
         StringBuilder��String�����໥ת��:
             String->StringBuilder:����ʹ��StringBuilder�Ĺ��췽��
                 StringBuilder(String str) ����һ���ַ���������������ʼ��Ϊָ�����ַ������ݡ�
             StringBuilder->String:����ʹ��StringBuilder�е�toString����
                 public String toString()������ǰStringBuilder����ת��ΪString����
          */
        String name="jun";
        StringBuilder str = new StringBuilder(name);
        System.out.println(str);
        String s = str.toString();
        System.out.println(s);

    }

}
