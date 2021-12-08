package demo33Exception;

import java.util.Objects;

/**
 * @author : Bojack
 * @date : Created in 19:12 2021.12.08
 *     Obects���еľ�̬����
 *     public static <T> T requireNonNull(T obj):�鿴ָ�����ö�����null��
 *     Դ��:
 *         public static <T> T requireNonNull(T obj) {
 *             if (obj == null)
 *                 throw new NullPointerException();
 *             return obj;
 *         }
 */
public class demo02Objects {
    public static void main(String[] args) {
        demo(null);
    }

    private static void demo(Object obj) {
        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj,"���ݲ���Ϊ��");
    }
}
