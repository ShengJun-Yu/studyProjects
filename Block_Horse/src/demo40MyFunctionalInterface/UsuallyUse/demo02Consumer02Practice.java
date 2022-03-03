package demo40MyFunctionalInterface.UsuallyUse;

import java.util.function.Consumer;

/**
 * @author : Bojack
 * @date : Created in 15:36 2022.02.28
 * ��ϰ:
 * �ַ������鵱�д��ж�����Ϣ���밴�ո�ʽ��������XX���Ա�XX�����ĸ�ʽ����Ϣ��ӡ������
 * Ҫ�󽫴�ӡ�����Ķ�����Ϊ��һ��Consumer�ӿڵ�Lambdaʵ����
 * ����ӡ�Ա�Ķ�����Ϊ�ڶ���Consumer�ӿڵ�Lambdaʵ����
 * ������Consumer�ӿڰ���˳��ƴ�ӡ���һ��
 */
public class demo02Consumer02Practice {
    public static void show(String[] name, Consumer<String> con, Consumer<String> con1) {
        for (String s : name) {
            con.andThen(con1).accept(s);
        }
    }

    public static void main(String[] args) {
        String[] name = {"Rilly,15", "Bojack,19"};

        show(name, (String names) -> {
            String s = names.split(",")[0];
            System.out.print("������" + s);
        }, (String names) -> {
            String s = names.split(",")[1];
            System.out.println("���䣺" + s);
        });
    }
}
