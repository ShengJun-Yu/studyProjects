package ����;

/**
 * @author : Bojack
 * @date : 2021��9��22��20:25:17
 *ʹ�÷�����ʱ��ע�����
 *
 * 1. ����Ӧ�ö������൱�У����ǲ����ڷ��������ٶ��巽��������Ƕ�ס�
 * 2. ���������ǰ��˳������ν��
 * 3. ��������֮�󲻻�ִ�У����ϣ��ִ�У�һ��Ҫ���ã��������á���ӡ���á���ֵ���á�
 * 4. ��������з���ֵ����ô����д�ϡ�return ����ֵ;��������û�С�
 * 5. return����ķ���ֵ���ݣ�����ͷ����ķ���ֵ���ͣ���Ӧ������
 * 6. ����һ��voidû�з���ֵ�ķ���������дreturn����ķ���ֵ��ֻ��дreturn�Լ���
 * 7. ����void�����������һ�е�return����ʡ�Բ�д��
 * 8. һ���������п����ж��return��䣬���Ǳ��뱣֤ͬʱֻ��һ���ᱻִ�е�������return������д��
 */
public class ������ϰ {
    public static void main(String[] args) {
        System.out.println(sam(3, 3));

        int he = sum();
        System.out.println(he);

        printhello(4);
    }

    /**
     * ����һ�������������ж����������Ƿ���ͬ��
     *
     * @param a
     * @param b
     * @return
     */
    public static boolean sam(int a, int b) {
//        boolean same;
//        if (a==b){
//            same=ture;
//        }else{
//            same=false;
//        }
//        return same;
        return a == b;
    }

    /**
     * ����һ���������������1-100֮���������ֵĺ�ֵ��
     */
    public static int sum() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }
    /**
     * ����һ��������������ӡָ��������HelloWorld��
     */
    public static void  printhello(int num){
        for (int i = 0; i < num; i++) {
            System.out.println("hello");
        }
    }
}
