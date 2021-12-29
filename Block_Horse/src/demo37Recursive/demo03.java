package demo37Recursive;

import java.io.File;

/**
 * @author : Bojack
 * @date : Created in 18:48 2021.12.29
 * 练习:
 * 递归打印多级目录
 * 需求:
 * 遍历 任意 文件夹,及 任意 文件夹的子文件夹
 * 只要java结尾的文件

 */
public class demo03 {
    public static void main(String[] args) {
        File f = new File("D:\\workspace\\studyProjects\\Block_Horse\\src\\demo36File");
        prin(f);
    }

    public static void prin(File f) {
        File[] files = f.listFiles();
        for (File i : files) {
            if (i.isDirectory()) {
                prin(i);
            } else {
////                把字符串,转换为小写
//                String path = i.getPath();
//                //把字符串,转换为小写
//                String s = path.toLowerCase();
////                调用String类中的方法endsWith判断字符串是否是以.java结尾
//                if(s.endsWith(".java")){
//                    System.out.println(i);
//                }
//                链式编程
                if(i.getPath().toLowerCase().endsWith(".java")){
                    System.out.println(i);
                }
            }
        }
    }
}
