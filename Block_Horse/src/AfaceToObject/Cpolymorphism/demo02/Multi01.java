package AfaceToObject.Cpolymorphism.demo02;

/**
 * @author : Bojack
 * @date : Created in 15:57 2021.11.14
 * ����ת��һ���ǰ�ȫ�ģ�û������ģ���ȷ�ġ�����Ҳ��һ���׶ˣ�
 * ����һ������ת��Ϊ���࣬��ô���޷���������ԭ�����е����ݡ�
 * <p>
 * ����������ö��������ת�͡���ԭ����
 */
public class Multi01 {
    public static void main(String[] args) {
        // ���������ת�ͣ����ǣ���������ָ��֮�����
        Animal animal = new Cat(); // ����������ʱ����һֻè
        animal.eat();

//        �ö��������ת�͡���ԭ��
        Dog dog =(Dog)animal;
        dog.eatShit();

//        Cat cat=(Cat)animal;//ClassCastException


    }
}
