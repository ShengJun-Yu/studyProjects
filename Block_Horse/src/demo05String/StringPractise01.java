package demo05String;

/**
 * @author : Bojack
 * @date : 2021��10��16��16:28:08
 * ��Ŀ��
 * ����һ��������������{1,2,3}����ָ����ʽƴ�ӳ�һ���ַ�������ʽ�������£�[word1#word2#word3]��
 * <p>
 * ������
 * 1. ����׼��һ��int[]���飬�����ǣ�1��2��3
 * 2. ����һ���������������������ַ���
 * ��Ҫ��
 * ����ֵ���ͣ�String
 * �������ƣ�fromArrayToString
 * �����б�int[]
 * 3. ��ʽ��[word1#word2#word3]
 * �õ���forѭ�����ַ���ƴ�ӡ�ÿ������Ԫ��֮ǰ����һ��word�������ָ�ʹ�õ���#������һ���ǲ������һ��
 * 4. ���÷������õ�����ֵ������ӡ����ַ���
 */
public class StringPractise01 {
    public static void main(String[] args) {
        int[] num = {1, 2, 3};
        System.out.println(getIntToArray(num));
    }

    public static String getIntToArray(int[] num) {
        String numArray = "[";
        for (int i = 0; i < num.length; i++) {
            if (i == num.length - 1) {
                numArray+="world" +num[i]+"]";
            }else{
                numArray+="world" +num[i] + "#";
            }
        }
        return numArray;
    }
}
