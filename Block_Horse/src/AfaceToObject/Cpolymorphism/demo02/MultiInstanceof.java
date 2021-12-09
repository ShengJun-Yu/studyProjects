package AfaceToObject.Cpolymorphism.demo02;

/**
 * @author : Bojack
 * @date : Created in 16:28 2021.11.14
 * ��β���֪��һ���������õĶ��󣬱�����ʲô���ࣿ
 * ��ʽ��
 * ���� instanceof ������
 * �⽫��õ�һ��booleanֵ�����Ҳ�����ж�ǰ��Ķ����ܲ��ܵ����������͵�ʵ����
 */
public class MultiInstanceof {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();
        System.out.println(animal instanceof Dog);
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.eatMouse();
        }
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.eatShit();
        }
        pet(new Cat());
    }

    public static void pet(Animal animal) {
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.eatMouse();
        }
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.eatShit();
        }
    }
}
