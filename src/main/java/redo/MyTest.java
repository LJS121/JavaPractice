package redo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jinsong.Liang
 * @Description
 * @date 2019/9/10 17:53
 */
public class MyTest {
    @Test
    public void test(){
        List list = new ArrayList();
        list.add("sf");
//        list.add(0);
        list.forEach(vo-> System.out.println(vo));
        System.out.println(list.stream().anyMatch(vo -> !"sf".equals(vo)));
        Object object = list.stream().filter(vo -> !"sf".equals(vo)).findFirst().orElse("null");
        System.out.println(object);
        System.out.println(object instanceof String);
    }
}
