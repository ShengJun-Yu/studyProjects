package demo45Annotations;

/**
 * @author : Bojack
 * @date : Created in 19:24 2022.03.10
 *  * JDK��Ԥ�����һЩע��
 *  * 		* @Override	����ⱻ��ע���ע�ķ����Ƿ��Ǽ̳��Ը���(�ӿ�)��
 *  * 		* @Deprecated����ע���ע�����ݣ���ʾ�ѹ�ʱ
 *  * 		* @SuppressWarnings��ѹ�ƾ���
 *  *
 *  *
 */
@MyAnnot(age = 11, value = 11, p=enums.p1,ann01 = @MyAnnot01(e=1),ir=1)
@SuppressWarnings("All")
public class demo01 {
    @Override
    public String toString() {
        return super.toString();
    }
    @Deprecated
    public void show1(){
        System.out.println("�ѹ�ʱ");
    }

    public void show2(){
        System.out.println("����ʹ�õİ汾");
    }
    public void thisis(){
        show1();
    }

}
