package demo45Annotations;

import java.lang.annotation.*;

/**
 * @author : Bojack
 * @date : Created in 20:53 2022.03.10
 * * @Target������ע���ܹ����õ�λ��
 *    ElementTypeȡֵ��
 *      TYPE����������������
 *      METHOD�����������ڷ�����
 *      FIELD�����������ڳ�Ա������
 * * @Retention������ע�ⱻ�����Ľ׶�
 *     @Retention (RetentionPolicy.RUNTIME)����ǰ��������ע�⣬�ᱣ����class�ֽ����ļ��У�����JVM��ȡ��
 * * @Documented������ע���Ƿ񱻳�ȡ��api�ĵ���
 * * @Inherited������ע���Ƿ�����̳�
 */
@Target(value = {ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface Myannot02 {
}
