package test;

import org.junit.Test;

/**
 * @author jinsong.Liang
 * @Description
 * @date 2019/4/12 11:37
 */
public class test19 {
    @Test
    public void test(){
        Object o = new Integer(0);
        System.out.println(o instanceof String);
        System.out.println(o instanceof Integer);
        System.out.println(o+"");
    }
}
