package demo33Exception.PersonException;

import java.util.Scanner;

/**
 * @author : Bojack
 * @date : Created in 19:05 2021.12.09
 * <p>
 * Ҫ������ģ��ע�����������û����Ѵ��ڣ����׳��쳣����ʾ���ף����û����Ѿ���ע�ᡣ
 * <p>
 * ����:
 * 1.ʹ�����鱣���Ѿ�ע������û���(���ݿ�)
 * 2.ʹ��Scanner��ȡ�û������ע����û���(ǰ��,ҳ��)
 * 3.����һ������,���û��������ע����û��������ж�
 * �����洢�Ѿ�ע����û���������,��ȡÿһ���û���
 * ʹ�û�ȡ�����û������û�������û����Ƚ�
 * true:
 * �û����Ѿ�����,�׳�RegisterException�쳣,��֪�û�"�ף����û����Ѿ���ע��";
 * false:
 * ���������Ƚ�
 * ���ѭ��������,��û���ҵ��ظ����û���,��ʾ�û�"��ϲ��,ע��ɹ�!";
 */
public class RegisteredUser {
    static String[] name = {"bojack", "jun", "cete"};

    public static void main(String[] args) /*throws RegisteredException*/ {
        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.nextLine();
        compare(name1, name);
    }

    public static void compare(String name1, String[] name) /*throws RegisteredException */{
        for (String s : name) {
            if (s.equals(name1)) {
                try {
                    throw new RegisteredException("���棡���û��Ѵ���");
                } catch (RegisteredException e) {
                    System.out.println(e);
                    return;
                }
            }
        }
        System.out.println("ע��ɹ�");
    }

}
