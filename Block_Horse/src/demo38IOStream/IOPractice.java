package demo38IOStream;

import java.io.*;
import java.util.HashMap;

/**
 * @author : Bojack
 * @date : Created in 16:20 2022.01.03
 * ��ϰ:
 * ���ı������ݽ�������
 * ����(1,2,3....)˳������
 * ����:
 * 1.����һ��HashMap���϶���,����:�洢ÿ���ı������(1,2,3,..);value:�洢ÿ�е��ı�
 * 2.�����ַ���������������,���췽���а��ַ�������
 * 3.�����ַ��������������,���췽���а��ַ������
 * 4.ʹ���ַ������������еķ���readline,���ж�ȡ�ı�
 * 5.�Զ�ȡ�����ı������и�,��ȡ���е���ź��ı�����
 * 6.���и�õ���ź��ı������ݴ洢��HashMap������(key����������,���Զ�����1,2,3,4..)
 * 7.����HashMap����,��ȡÿһ����ֵ��
 * 8.��ÿһ����ֵ��,ƴ��Ϊһ���ı���
 * 9.��ƴ�Ӻõ��ı�,ʹ���ַ�����������еķ���write,д�뵽�ļ���
 * 10.�ͷ���Դ
 */
public class IOPractice {
    public static void main(String[] args) throws IOException {
//        ����һ��HashMap���϶���,����:�洢ÿ���ı������(1,2,3,..);value:�洢ÿ�е��ı�
        HashMap<String,String> hashmap=new HashMap<>();
//        �����ַ���������������,���췽���а��ַ�������
        BufferedReader br=new BufferedReader(new FileReader("Block_Horse/src/demo38IOStream/Practice.txt"));
//        �����ַ��������������,���췽���а��ַ������
        BufferedWriter bw=new BufferedWriter(new FileWriter("Block_Horse/src/demo38IOStream/Practice01.txt"));
        String len;
//        ʹ���ַ������������еķ���readline,���ж�ȡ�ı�
        while((len=br.readLine())!=null){
//            �Զ�ȡ�����ı������и�,��ȡ���е���ź��ı�����
            String[] split = len.split("\\.");
//            ���и�õ���ź��ı������ݴ洢��HashMap������(key����������,���Զ�����1,2,3,4..)
            hashmap.put(split[0],split[1]);
        }
//        ����HashMap����,��ȡÿһ����ֵ��
        for (String key:
             hashmap.keySet()) {
//            ��ÿһ����ֵ��,ƴ��Ϊһ���ı���
            String s = key + "." + hashmap.get(key);
//            ��ƴ�Ӻõ��ı�,ʹ���ַ�����������еķ���write,д�뵽�ļ���
            bw.write(s);
            bw.newLine();
        }
//        �ͷ���Դ
        bw.close();
        br.close();

    }
}
