package demo17Object;


import java.util.Objects;

/**
 * @author : Bojack
 * @date : Created in 21:32 2021.11.19
 */
public class Objectsss {
    public static void main(String[] args) {
        String n1 = null;
        String n2 = "qqq";
  /*   boolean b = n1.equals(n2);
       System.out.println(b);//NullPointerException,null�޷����÷������׳���ָ���쳣

        Objects���equals����:������������бȽ�,��ֹ��ָ���쳣
        public static boolean equals(Object a, Object b) {
            return (a == b) || (a != null && a.equals(b));
        }
   */
        boolean b1 = Objects.equals(n1, n2);
        System.out.println(b1);

    }
}
