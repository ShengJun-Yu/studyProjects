package �����﷨;

/**
 * @author : Bojack
 * @date : 2021��9��22��17:16:36
 */
public class typleOfData {
    public static void main(String[] args) {

//������������
        System.out.println("������������");
        int x = 10;
        //����x����������10��Ϊx��ֵ10
        int y = x * 2;
        //�������y
        System.out.println(x);
        System.out.println(y);
        System.out.println();  //����

//�������
        System.out.println("�������");
        long longnum = 214744444483650L;
        //�����ݣ��������Ѿ�����Ĭ����������int�ı�ʾ��Χ���ʼӺ�׺��L����ʾ�˳�����������Ϊlong
        int intnum = (int) longnum;
        System.out.println(longnum);
        System.out.println(intnum);
        System.out.println();  //��long���ͱ���ת��Ϊint���ͱ����������ڳ�����Χ���ʷ����������

// ���帡��������
        System.out.println("���帡��������");
        double xiaoshu1 = 7.7;//7.7��С��������Ĭ������double����
        System.out.println(xiaoshu1 * 2);  //double ��*int �ͣ��Զ�ת��Ϊdouble�ͣ�2.0�� = double ��
        float xiaoshu2 = 8.8F;  //С��Ĭ������Ϊdouble��������Ҫ����float�������ݣ��Ӻ�׺F����8.8F��Ҳ����д�ɡ�(float) 8.8"
        System.out.println(xiaoshu2);
        int xiaoshu3 = 12;
        int xiaoshu4 = 5;
        System.out.println(xiaoshu3 / (double) xiaoshu4);
        System.out.println();
        //int �ͳ� int �ͣ�������� int �ͣ��������Ϊ��������Ҫ������һ�� int �����ݣ������򱻳�����ת��Ϊ double ��

// �����ַ�������
        System.out.println("�����ַ�������");
        char zifu1 = 'A';
        int zifu2 = zifu1;
        System.out.println(zifu1);  //����ַ�
        System.out.println(zifu2);  //�ַ��ͺ� int �ͻ�����int ���Ա������ʽ���֣�A������65�������65��
        System.out.println();

//���岼��������
        System.out.println("���岼�������� ");
        boolean buer1 = false;  //����������ֻ������ȡֵ��true��false
        if (!buer1) {
            System.out.println("Yes!");
            System.out.println();
        }  //if����

//����String������
        System.out.println("����String������");
        String str1 = "hello ";
        str1 = str1 + "Yin";  //�ַ�������
        str1 += "!!!";  //�ַ������Ӽ�
        System.out.println(str1);
        System.out.println();

//ȡֵ��䣺��������.MAX_VALUE
        System.out.println("ȡֵ��䣺��������.MAX_VALUE");
        int maxint = Integer.MAX_VALUE;   //ȡ�������� int��integer����д�������ֵ
        int minint = Integer.MIN_VALUE;  //ȡ�������� int����Сֵ
        short maxshort = Short.MAX_VALUE;
        short minshort = Short.MIN_VALUE;
        byte maxbyte = Byte.MAX_VALUE;
        byte minbyte = Byte.MIN_VALUE;
        long maxlong = Long.MAX_VALUE;
        long minlong = Long.MIN_VALUE;
        double maxdoub = Double.MAX_VALUE;
        double mindoub = Double.MIN_VALUE;
        System.out.println(maxbyte);
        System.out.println(minbyte);
        System.out.println(maxshort);
        System.out.println(minshort);
        System.out.println(maxint);
        System.out.println(minint);
        System.out.println(maxlong);
        System.out.println(minlong);
        System.out.println(maxdoub);
        System.out.println(mindoub);
    }
}
