package demo33Exception.PersonException;

import java.util.Scanner;

/**
 * @author : Bojack
 * @date : Created in 19:05 2021.12.09
 * <p>
 * 要求：我们模拟注册操作，如果用户名已存在，则抛出异常并提示：亲，该用户名已经被注册。
 * <p>
 * 分析:
 * 1.使用数组保存已经注册过的用户名(数据库)
 * 2.使用Scanner获取用户输入的注册的用户名(前端,页面)
 * 3.定义一个方法,对用户输入的中注册的用户名进行判断
 * 遍历存储已经注册过用户名的数组,获取每一个用户名
 * 使用获取到的用户名和用户输入的用户名比较
 * true:
 * 用户名已经存在,抛出RegisterException异常,告知用户"亲，该用户名已经被注册";
 * false:
 * 继续遍历比较
 * 如果循环结束了,还没有找到重复的用户名,提示用户"恭喜您,注册成功!";
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
                    throw new RegisteredException("警告！该用户已存在");
                } catch (RegisteredException e) {
                    System.out.println(e);
                    return;
                }
            }
        }
        System.out.println("注册成功");
    }

}
