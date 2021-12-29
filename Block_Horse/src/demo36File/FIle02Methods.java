package demo36File;

import java.io.File;

/**
 * @author : Bojack
 * @date : Created in 18:35 2021.12.27
 *    File类获取功能的方法
 *         - public String getAbsolutePath() ：返回此File的绝对路径名字符串。
 *         - public String getPath() ：将此File转换为路径名字符串。
 *         - public String getName()  ：返回由此File表示的文件或目录的名称。
 *         - public long length()  ：返回由此File表示的文件的长度。
 */
public class FIle02Methods {
    public static void main(String[] args) {
        getAbsolutePath();
        getPath();
        getName();
        getLengths();
    }
    /*
        public long length()  ：返回由此File表示的文件的长度。
        获取的是构造方法指定的文件的大小,以字节为单位
        注意:
            文件夹是没有大小概念的,不能获取文件夹的大小
            如果构造方法中给出的路径不存在,那么length方法返回0
     */
    private static void getLengths() {
        File f=new File("D:\\workspace\\studyProjects\\Block_Horse\\pic\\01_input.jpg");
        long length = f.length();
        System.out.println(length);
    }
   /*
       public String getName()  ：返回由此File表示的文件或目录的名称。
       获取的就是构造方法传递路径的结尾部分(文件/文件夹)
    */
    private static void getName() {
        File f=new File("D:\\workspace\\studyProjects\\01_input.jpg");
        File f1=new File("D:\\workspace\\studyProjects");
        String name = f.getName();
        String name1 = f1.getName();
        System.out.println("getName();;"+name+"==="+name1);
    }

    /*
        public String getPath() ：将此File转换为路径名字符串。
        获取的构造方法中传递的路径
        toString方法调用的就是getPath方法
        源码:
            public String toString() {
                return getPath();
            }
       */
    private static void getPath() {
        File f=new File("D:\\workspace\\studyProjects\\01_input.jpg");
        File f1=new File("01_input.jpg");
        String path = f.getPath();
        String path1 = f1.getPath();
        System.out.println("getPath();;"+path+"==="+path1);
    }


    /*
        public String getAbsolutePath() ：返回此File的绝对路径名字符串。
        获取的构造方法中传递的路径
        无论路径是绝对的还是相对的,getAbsolutePath方法返回的都是绝对路径
     */
    private static void getAbsolutePath() {
        File f=new File("D:\\workspace\\studyProjects\\01_input.jpg");
        File f1=new File("01_input.jpg");
        String absolutePath = f.getAbsolutePath();
        String absolutePath1 = f1.getAbsolutePath();
        System.out.println("getAbsolutePath();;"+absolutePath+"==="+absolutePath1);
    }
}
