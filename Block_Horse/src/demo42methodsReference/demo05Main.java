package demo42methodsReference;

/**
 * @author : Bojack
 * @date : Created in 19:58 2022.03.07
 *  ʹ��this���ñ���ĳ�Ա����
 */
public class demo05Main {
    public void buyhouse() {
        System.out.println("�򲬽�300kg");
    }

    public void marry(demo05Interface d) {
        d.buy();
    }

    public void happy() {
//        marry(() -> {
//            this.buyhouse();
//   d});
        /*
            ʹ�÷��������Ż�Lambda���ʽ
            this���Ѿ����ڵ�
            ����ĳ�Ա����buyHouseҲ���Ѿ����ڵ�
            �������ǿ���ֱ��ʹ��this���ñ���ĳ�Ա����buyHouse
         */
        marry(this::buyhouse);
    }


    public static void main(String[] args) {
        new demo05Main().happy();
    }
}
