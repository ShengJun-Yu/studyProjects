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
//    @Before注解表示测试时所有方法执行前，都会先执行的方法
    @Before
    public void begin(){
        System.out.println("@Before注解表示测试时所有方法执行前，都会先执行的方法");
    }
//    @After注解表示测试时所有方法执行完后，都会自动执行的方法
    @After
    public void close(){
        System.out.println("@After注解表示测试时所有方法执行完后，都会自动执行的方法");
    }
    @Test
    public void cal(){
//        System.out.println("wre");
        cal c=new cal();
        int jia = c.jia(1, 3);
        System.out.println(jia);
        //断言值为3，实际值为jia:错误红色
        //断言值为4，实际值为jia:正确绿色

        Assert.assertEquals(4,jia);
    }


}
