package demo41Stream.demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Bojack
 * @date : Created in 14:58 2022.03.07
 * ʹ��Stream���ķ�ʽ,��������,�Լ����е����ݽ��й���
 *     Stream����JDK1.8֮����ֵ�
 *     ��ע������ʲô,��������ô��
 */
public class FilterData {
    public static void main(String[] args) {
        //����һ��List����,�洢����
        List<String> list = new ArrayList<>();
        list.add("���޼�");
        list.add("������");
        list.add("����");
        list.add("��ǿ");
        list.add("������");

        list.stream()
                .filter((name)->name.startsWith("��"))
                .filter((name)->name.length()>=3)
                .forEach((name)-> System.out.println(name));
    }
}