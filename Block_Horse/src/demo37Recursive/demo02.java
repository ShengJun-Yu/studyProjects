package demo37Recursive;

import java.io.File;

/**
 * @author : Bojack
 * @date : Created in 17:20 2021.12.29
 * 练习:
 * 递归打印多级目录
 * 需求:
 * 遍历 任意 文件夹,及 任意 文件夹的子文件夹

 */
public class demo02 {
    public static void main(String[] args) {
        File f = new File("D:\\迅雷下载");
        prin(f);
    }

    public static void prin(File f) {
        System.out.println(f);
        File[] files = f.listFiles();
        for (File i : files) {
            if (i.isDirectory()) {
                prin(i);
            } else {
                System.out.println(i);
            }
        }
    }
}
