package demo36File;

import java.io.File;

/**
 * @author : Bojack
 * @date : Created in 17:57 2021.12.27
 * File类中的构造方法
 *
 * 路径:
 * 绝对路径:是一个完整的路径
 * 以盘符(c:,D:)开始的路径
 * c:\\a.txt
 * C:\\Users\itcast\\IdeaProjects\\shungyuan\\123.txt
 * D:\\demo\\b.txt
 * 相对路径:是一个简化的路径
 * 相对指的是相对于当前项目的根目录(C:\\Users\itcast\\IdeaProjects\\shungyuan)
 * 如果使用当前项目的根目录,路径可以简化书写
 * C:\\Users\itcast\\IdeaProjects\\shungyuan\\123.txt-->简化为: 123.txt(可以省略项目的根目录)
 * 注意:
 * 1.路径是不区分大小写
 * 2.路径中的文件名称分隔符windows使用反斜杠,反斜杠是转义字符,两个反斜杠代表一个普通的反斜杠
 */
public class File01Constructor {
    public static void main(String[] args) {
        pathname();
        connect("D:\\","a.txt");
        connectFile();

    }
       /*
        File(File parent, String child) 根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例。
        参数:把路径分成了两部分
            File parent:父路径
            String child:子路径
        好处:
             父路径和子路径,可以单独书写,使用起来非常灵活;父路径和子路径都可以变化
             父路径是File类型,可以使用File的方法对路径进行一些操作,再使用路径创建对象
     */
    public static void connectFile() {
        File two=new File("C:\\");
        File f=new File(two,"a.txt");
    }

    /*
     File(File parent, String child) 根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例。
            参数:把路径分成了两部分
                File parent:父路径
                String child:子路径
            好处:
                 父路径和子路径,可以单独书写,使用起来非常灵活;父路径和子路径都可以变化
                 父路径是File类型,可以使用File的方法对路径进行一些操作,再使用路径创建对象
     */
    public  static void connect(String a,String b) {
        File f=new File(a,b);
        System.out.println(f);
    }


    /*
       File(String pathname) 通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例。
        参数:
            String pathname:字符串的路径名称
            路径可以是以文件结尾,也可以是以文件夹结尾
            路径可以是相对路径,也可以是绝对路径
            路径可以是存在,也可以是不存在
            创建File对象,只是把字符串路径封装为File对象,不考虑路径的真假情况
     */
    public static void pathname() {
      File f= new File("D:\\百度云盘\\02-Java语言进阶\\day08_File类、递归\\code\\08_FileAndRecursion\\src\\com\\itheima\\demo01\\File");
        System.out.println(f);//toString已经重写
    }
}
