package demo24Collection.Practice;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author : Bojack
 * @date : Created in 10:59 2021.12.01
 * �������ۺϰ���:
 * 1.׼����
 * 2.ϴ��
 * 3.����
 * 4.����
 */
public class FightWithRich {
    public static void main(String[] args) {
        /*
        1.׼����
         */
//        ������������洢��ɫ������
        String[] flower = {"����", "����", "÷��", "����"};
        String[] number = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
//        ����һ���������������˿���
        ArrayList<String> poker = new ArrayList<>();
//        ��Ӵ�С��
        poker.add("����");
        poker.add("С��");
//        ʹ��ѭ��Ƕ�׽���ɫ��������װ��һ������ӵ�����poker��
        for (String a : flower) {
            for (String b : number) {
                poker.add(a + b);

            }
        }
//        ���������ƺ���˿�
        System.out.println(poker);
        /*
       2.ϴ��
         */
//        shuffle(List<?> list) ʹ��Ĭ�ϵ����Դ�������ָ�����б������������
        Collections.shuffle(poker);
//        ���Һ������
        System.out.println(poker);
        /*
         3.����
         */
//        ����3����Һ͵��Ƽ���
        ArrayList<String> player01=new ArrayList<>();
        ArrayList<String> player02=new ArrayList<>();
        ArrayList<String> player03=new ArrayList<>();
        ArrayList<String> dipai=new ArrayList<>();
        for (int i = 0; i < poker.size(); i++) {
            String s = poker.get(i);
            if(i>50){
                dipai.add(s);
            } else if (i%3==0){
                player01.add(s);
            }else if(i%3==1){
                player02.add(s);
            }else if(i%3==2){
                player03.add(s);
            }
        }
        /*
        4.����
         */
        System.out.println("Bojack����:"+player01);
        System.out.println("Cete����:"+player02);
        System.out.println("Stepen����:"+player03);
        System.out.println("����:"+dipai);


    }
}
