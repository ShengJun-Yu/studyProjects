package �����﷨;


/**
 * @author : Bojack
 * @date : 2021��9��21��19:33:27
 */
public class ѡ����� {
    public static void main(String[] args) {
        b();
    }

    /**
     * ѡ����� switch
     * ע�⣡����
     * 1.case�����ݲ������ظ�
     * 2.switch��ֻ�ܽ�
     * �������ݣ� byte  short  char int
     * �������ݣ� String�ַ�����enumö��
     * 3.switch ����ʽ�ǳ��� ǰ��˳����Եߵ���break������ʡ��
     */
    public static void b() {
        int num = 33;
        switch (num) {
            case 1:
                System.out.println("����һ");
                break;
            case 2:
                System.out.println("���ڶ�");
                break;
            case 3:
                System.out.println("������");
                break;
            case 4:
                System.out.println("������");
                break;
            case 5:
                System.out.println("������");
                break;
            case 6:
                System.out.println("������");
                break;
            case 7:
                System.out.println("������");
                break;
            default:
                System.out.println("���ݴ���");
                break;
        }
    }

}

