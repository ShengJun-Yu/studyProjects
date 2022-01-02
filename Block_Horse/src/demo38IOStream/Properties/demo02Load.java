package demo38IOStream.Properties;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * @author : Bojack
 * @date : Created in 17:26 2022.01.02
 *   ����ʹ��Properties�����еķ���load,��Ӳ���б�����ļ�(��ֵ��),��ȡ��������ʹ��
 *         void load(InputStream inStream)
 *         void load(Reader reader)
 *         ����:
 *             InputStream inStream:�ֽ�������,���ܶ�ȡ�������ĵļ�ֵ��
 *             Reader reader:�ַ�������,�ܶ�ȡ�������ĵļ�ֵ��
 *         ʹ�ò���:
 *             1.����Properties���϶���
 *             2.ʹ��Properties���϶����еķ���load��ȡ�����ֵ�Ե��ļ�
 *             3.����Properties����
 *         ע��:
 *             1.�洢��ֵ�Ե��ļ���,����ֵĬ�ϵ����ӷ��ſ���ʹ��=,�ո�(��������)
 *             2.�洢��ֵ�Ե��ļ���,����ʹ��#����ע��,��ע�͵ļ�ֵ�Բ����ٱ���ȡ
 *             3.�洢��ֵ�Ե��ļ���,����ֵĬ�϶����ַ���,�����ټ�����
 */
public class demo02Load {
    public static void main(String[] args) throws IOException {
        Properties p=new Properties();
        p.load(new FileReader("Block_Horse/src/demo38IOStream/Properties/demo01.txt"));
        Set<String> str = p.stringPropertyNames();
        for (String key: str) {
            System.out.println(key+"=="+p.getProperty(key));
        }

    }
}
