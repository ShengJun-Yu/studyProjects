package demo36File;

import java.io.File;

/**
 * @author : Bojack
 * @date : Created in 19:09 2021.12.27
 *     File类判断功能的方法
 *         - public boolean exists() ：此File表示的文件或目录是否实际存在。
 *         - public boolean isDirectory() ：此File表示的是否为目录。
 *         - public boolean isFile() ：此File表示的是否为文件。
 */
public class File02Methods01 {
    public static void main(String[] args) {
        exists();
        isFileAndIsDirectory();
    }
   /*
   public boolean isDirectory() ：此File表示的是否为目录。
    用于判断构造方法中给定的路径是否以文件夹结尾
    是:true
    否:false
    public boolean isFile() ：此File表示的是否为文件。
    用于判断构造方法中给定的路径是否以文件结尾
    是:true
    否:false
    注意:
    电脑的硬盘中只有文件/文件夹,两个方法是互斥
            这两个方法使用前提,路径必须是存在的,否则都返回false
    */
    private static void isFileAndIsDirectory() {
        File f=new File("D:\\workspace\\studyProjects\\Block_Horse\\pic\\01_input.jpg");
        if (f.exists()){
            boolean directory = f.isDirectory();
            System.out.println(directory);
            boolean file = f.isFile();
            System.out.println(file);
        }

    }

    /*
         public boolean exists() ：此File表示的文件或目录是否实际存在。
         用于判断构造方法中的路径是否存在
             存在:true
             不存在:false
     */
    private static void exists() {
        File f=new File("D:\\workspace\\studyProjects\\Block_Horse\\pic\\01_input.jpg");
        boolean exists = f.exists();
        System.out.println(exists);

    }
}
