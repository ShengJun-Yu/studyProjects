package demo36File.demo01file;

import java.io.File;

/**
 * @author : Bojack
 * @date : Created in 17:31 2021.12.27
 *   java.io.File��
 *     �ļ���Ŀ¼·�����ĳ����ʾ��ʽ��
 *     java�ѵ����е��ļ����ļ���(Ŀ¼)��װΪ��һ��File��,���ǿ���ʹ��File����ļ����ļ��н��в���
 *     ���ǿ���ʹ��File��ķ���
 *         ����һ���ļ�/�ļ���
 *         ɾ���ļ�/�ļ���
 *         ��ȡ�ļ�/�ļ���
 *         �ж��ļ�/�ļ����Ƿ����
 *         ���ļ��н��б���
 *         ��ȡ�ļ��Ĵ�С
 *     File����һ����ϵͳ�޹ص���,�κεĲ���ϵͳ������ʹ��������еķ���
 *
 *     �ص�:��ס����������
 *         file:�ļ�
 *         directory:�ļ���/Ŀ¼
 *         path:·��
 */
public class PathSeparatorAndSeparatorChar {
    public static void main(String[] args) {
         /*
            static String pathSeparator ��ϵͳ�йص�·���ָ�����Ϊ�˷��㣬������ʾΪһ���ַ�����
            static char pathSeparatorChar ��ϵͳ�йص�·���ָ�����

            static String separator ��ϵͳ�йص�Ĭ�����Ʒָ�����Ϊ�˷��㣬������ʾΪһ���ַ�����
            static char separatorChar ��ϵͳ�йص�Ĭ�����Ʒָ�����

            ����·��:·������д����
            C:\develop\a\a.txt  windows
            C:/develop/a/a.txt  linux
            "C:"+File.separator+"develop"+File.separator+"a"+File.separator+"a.txt"
         */
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);//wondows: ; , linux : :

        char separatorChar = File.separatorChar;
        System.out.println(separatorChar);//wondows: \ , linux : /


    }
}
