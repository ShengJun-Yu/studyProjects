package demo29Map;

import java.util.HashMap;
import java.util.Scanner;
/**
 * @author : Bojack
 * @date : Created in 20:05 2021.12.07
 *     ��ϰ:
 *         ����һ���ַ�����ÿ���ַ����ִ���
 *     ����:
 *         1.ʹ��Scanner��ȡ�û�������ַ���
 *         2.����Map����,key���ַ����е��ַ�,value���ַ��ĸ���
 *         3.�����ַ���,��ȡÿһ���ַ�
 *         4.ʹ�û�ȡ�����ַ�,ȥMap�����ж�key�Ƿ����
 *             key����:
 *                 ͨ���ַ�(key),��ȡvalue(�ַ�����)
 *                 value++
 *                 put(key,value)���µ�value�洢��Map������
 *             key������:
 *                 put(key,1)
 *         5.����Map����,������
 */
public class MapPractise {
    public static void main(String[] args) {
//        2.����Map����,key���ַ����е��ַ�,value���ַ��ĸ���
        HashMap<Character,Integer> hashmap=new HashMap<>();
//        1.ʹ��Scanner��ȡ�û�������ַ���
        System.out.println("������һ�������ַ�");
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
//        System.out.println(s);
        char[] chars = s.toCharArray();
//        3.�����ַ���,��ȡÿһ���ַ�
        for (int i = 0; i < chars.length; i++) {
//            4.ʹ�û�ȡ�����ַ�,ȥMap�����ж�key�Ƿ����
           if(hashmap.containsKey(chars[i])) {
//             key����:ͨ���ַ�(key),��ȡvalue(�ַ�����)
               Integer value = hashmap.get(chars[i]);
               value++;
               hashmap.put(chars[i],value);
           }else {
//               key������:
               hashmap.put(chars[i],1);
           }
        }
//        5.����Map����,������
        System.out.println(hashmap);
    }
}
