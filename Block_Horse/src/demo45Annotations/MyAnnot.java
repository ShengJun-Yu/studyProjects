package demo45Annotations;

/**
 * @author : Bojack
 * @date : Created in 19:32 2022.03.10
 */
public @interface MyAnnot {
    //    ������������
    int age();

    //���ֻ��һ��������Ҫ��ֵ��������������Ϊvalue����ôvalue���Բ�д��
    int value();

    //String ����
//default,Ĭ�ϸ�name��ֵΪdweʹ��ʱ���Բ����и�ֵ��
    String name() default "dwe";

    //ö������
    enums p();

    //ע������
    MyAnnot01 ann01();

    //    ��������,�������ֻ��һ����ô���Բ�д{}
    int[] ir();
}