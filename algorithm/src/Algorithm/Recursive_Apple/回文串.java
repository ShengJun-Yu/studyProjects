package Algorithm.Recursive_Apple;

import java.util.Scanner;
public class ���Ĵ� {
    public static void main(String[] args) {
        String checkStr = null;
        System.out.println("������Ҫ�����ַ�����");
        Scanner in = new Scanner(System.in);
        checkStr = in.nextLine();        // �洢�û�������ַ���
        if (isPaildrome(checkStr)) {        // �ж�������ַ����Ƿ�Ϊ���Ĵ�
            System.out.println(checkStr + "�ǻ��Ĵ���");
        } else {
            System.out.println(checkStr + "���ǻ��Ĵ���");
        }
    }

    private static boolean isPaildrome(String check) {
        int low = 0;                // �������ַ�������
        int high = check.length() - 1;        // ����β�ӷ�������
        while (low < high) {
            // �����β�����ַ��Ƿ����
            if (check.charAt(low) != check.charAt(high))
                return false;
            low++;
            high--;
        }
        return true;
    }
}
/**
 * �ݹ鷨ʵ��
 */
