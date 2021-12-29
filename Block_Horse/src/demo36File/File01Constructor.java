package demo36File;

import java.io.File;

/**
 * @author : Bojack
 * @date : Created in 17:57 2021.12.27
 * File���еĹ��췽��
 *
 * ·��:
 * ����·��:��һ��������·��
 * ���̷�(c:,D:)��ʼ��·��
 * c:\\a.txt
 * C:\\Users\itcast\\IdeaProjects\\shungyuan\\123.txt
 * D:\\demo\\b.txt
 * ���·��:��һ���򻯵�·��
 * ���ָ��������ڵ�ǰ��Ŀ�ĸ�Ŀ¼(C:\\Users\itcast\\IdeaProjects\\shungyuan)
 * ���ʹ�õ�ǰ��Ŀ�ĸ�Ŀ¼,·�����Լ���д
 * C:\\Users\itcast\\IdeaProjects\\shungyuan\\123.txt-->��Ϊ: 123.txt(����ʡ����Ŀ�ĸ�Ŀ¼)
 * ע��:
 * 1.·���ǲ����ִ�Сд
 * 2.·���е��ļ����Ʒָ���windowsʹ�÷�б��,��б����ת���ַ�,������б�ܴ���һ����ͨ�ķ�б��
 */
public class File01Constructor {
    public static void main(String[] args) {
        pathname();
        connect("D:\\","a.txt");
        connectFile();

    }
       /*
        File(File parent, String child) ���� parent ����·������ child ·�����ַ�������һ���� File ʵ����
        ����:��·���ֳ���������
            File parent:��·��
            String child:��·��
        �ô�:
             ��·������·��,���Ե�����д,ʹ�������ǳ����;��·������·�������Ա仯
             ��·����File����,����ʹ��File�ķ�����·������һЩ����,��ʹ��·����������
     */
    public static void connectFile() {
        File two=new File("C:\\");
        File f=new File(two,"a.txt");
    }

    /*
     File(File parent, String child) ���� parent ����·������ child ·�����ַ�������һ���� File ʵ����
            ����:��·���ֳ���������
                File parent:��·��
                String child:��·��
            �ô�:
                 ��·������·��,���Ե�����д,ʹ�������ǳ����;��·������·�������Ա仯
                 ��·����File����,����ʹ��File�ķ�����·������һЩ����,��ʹ��·����������
     */
    public  static void connect(String a,String b) {
        File f=new File(a,b);
        System.out.println(f);
    }


    /*
       File(String pathname) ͨ��������·�����ַ���ת��Ϊ����·����������һ���� File ʵ����
        ����:
            String pathname:�ַ�����·������
            ·�����������ļ���β,Ҳ���������ļ��н�β
            ·�����������·��,Ҳ�����Ǿ���·��
            ·�������Ǵ���,Ҳ�����ǲ�����
            ����File����,ֻ�ǰ��ַ���·����װΪFile����,������·����������
     */
    public static void pathname() {
      File f= new File("D:\\�ٶ�����\\02-Java���Խ���\\day08_File�ࡢ�ݹ�\\code\\08_FileAndRecursion\\src\\com\\itheima\\demo01\\File");
        System.out.println(f);//toString�Ѿ���д
    }
}
