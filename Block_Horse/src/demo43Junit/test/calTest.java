package demo43Junit.test;

import demo43Junit.Cal.cal;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author : Bojack
 * @date : Created in 21:05 2022.03.07
 */
public class calTest {
//    @Beforeע���ʾ����ʱ���з���ִ��ǰ��������ִ�еķ���
    @Before
    public void begin(){
        System.out.println("@Beforeע���ʾ����ʱ���з���ִ��ǰ��������ִ�еķ���");
    }
//    @Afterע���ʾ����ʱ���з���ִ����󣬶����Զ�ִ�еķ���
    @After
    public void close(){
        System.out.println("@Afterע���ʾ����ʱ���з���ִ����󣬶����Զ�ִ�еķ���");
    }
    @Test
    public void cal(){
//        System.out.println("wre");
        cal c=new cal();
        int jia = c.jia(1, 3);
        System.out.println(jia);
        //����ֵΪ3��ʵ��ֵΪjia:�����ɫ
        //����ֵΪ4��ʵ��ֵΪjia:��ȷ��ɫ

        Assert.assertEquals(4,jia);
    }


}
