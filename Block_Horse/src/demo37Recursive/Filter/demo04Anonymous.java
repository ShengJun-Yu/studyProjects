package demo37Recursive.Filter;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @author : Bojack
 * @date : Created in 19:28 2021.12.29
 * 需求:
 * 遍历c:\\abc文件夹,及abc文件夹的子文件夹
 * 我们可以使用过滤器来实现
 * 在File类中有两个和ListFiles重载的方法,方法的参数传递的就是过滤器
 * <p>
 * File[] listFiles(FileFilter filter)
 * java.io.FileFilter接口:用于抽象路径名(File对象)的过滤器。
 * 作用:用来过滤文件(File对象)
 * 抽象方法:用来过滤文件的方法
 * boolean accept(File pathname) 测试指定抽象路径名是否应该包含在某个路径名列表中。
 * 参数:
 * File pathname:使用ListFiles方法遍历目录,得到的每一个文件对象
 * <p>
 * File[] listFiles(FilenameFilter filter)
 * java.io.FilenameFilter接口:实现此接口的类实例可用于过滤器文件名。
 * 作用:用于过滤文件名称
 * 抽象方法:用来过滤文件的方法
 * boolean accept(File dir, String name) 测试指定文件是否应该包含在某一文件列表中。
 * 参数:
 * File dir:构造方法中传递的被遍历的目录
 * String name:使用ListFiles方法遍历目录,获取的每一个文件/文件夹的名称
 * 注意:
 * 两个过滤器接口是没有实现类的,需要我们自己写实现类,重写过滤的方法accept,在方法中自己定义过滤的规则
 */
public class demo04Anonymous {
    public static void main(String[] args) {
        File f = new File("D:\\workspace\\studyProjects\\Block_Horse\\src\\demo36File");
        getAllName(f);
    }

    private static void getAllName(File f) {
//        使用匿名接口实现FileFilter
//        File[] files = f.listFiles(new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//                return pathname.getName().toLowerCase().endsWith(".java") || pathname.isDirectory();
//            }
//        });
        //        使用匿名接口实现FilenameFilter
        File[] files = f.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir,name).isDirectory()||name.toLowerCase().endsWith(".java");
            }
        });
        for (File i : files) {
            if (i.isDirectory()) {
                getAllName(i);
            } else {
                System.out.println(i/*.toString()*/);
            }
        }
    }
}
