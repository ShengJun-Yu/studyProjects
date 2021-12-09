package demo33Exception.PersonException;

/**
 * @author : Bojack
 * @date : Created in 18:45 2021.12.09
 * �Զ����쳣��:
 * java�ṩ���쳣��,��������ʹ��,��Ҫ�Լ�����һЩ�쳣��
 * ��ʽ:
 * public class XXXExcepiton extends Exception | RuntimeException{
 * ���һ���ղ����Ĺ��췽��
 * ���һ�����쳣��Ϣ�Ĺ��췽��
 * }
 * ע��:
 * 1.�Զ����쳣��һ�㶼����Exception��β,˵��������һ���쳣��
 * 2.�Զ����쳣��,����ļ̳�Exception����RuntimeException
 * �̳�Exception:��ô�Զ�����쳣�����һ���������쳣,��������ڲ��׳��˱������쳣,�ͱ��봦������쳣,Ҫôthrows,Ҫôtry...catch
 * �̳�RuntimeException:��ô�Զ�����쳣�����һ���������쳣,���账��,�������������(�жϴ���)
 */
public class RegisteredException extends Exception {
    //    ���һ���ղ����Ĺ��췽��
    public RegisteredException() {
        super();
    }

    //    ���һ�����쳣��Ϣ�Ĺ��췽��
    public RegisteredException(String message) {
        super(message);
    }
}
