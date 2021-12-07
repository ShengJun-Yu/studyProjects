package demo29Map;

import java.util.HashMap;
import java.util.Scanner;
/**
 * @author : Bojack
 * @date : Created in 20:05 2021.12.07
 *     练习:
 *         计算一个字符串中每个字符出现次数
 *     分析:
 *         1.使用Scanner获取用户输入的字符串
 *         2.创建Map集合,key是字符串中的字符,value是字符的个数
 *         3.遍历字符串,获取每一个字符
 *         4.使用获取到的字符,去Map集合判断key是否存在
 *             key存在:
 *                 通过字符(key),获取value(字符个数)
 *                 value++
 *                 put(key,value)把新的value存储到Map集合中
 *             key不存在:
 *                 put(key,1)
 *         5.遍历Map集合,输出结果
 */
public class MapPractise {
    public static void main(String[] args) {
        HashMap<Character,Integer> hashmap=new HashMap<>();
        System.out.println("请输入一个任意字符");
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
//        System.out.println(s);
        char[] chars = s.toCharArray();
        
        for (int i = 0; i < chars.length; i++) {
           if(hashmap.containsKey(chars[i])) {
               Integer value = hashmap.get(chars[i]);
               value++;
               hashmap.put(chars[i],value);
           }else {
               hashmap.put(chars[i],1);
           }
        }
        System.out.println(hashmap);


    }
}
