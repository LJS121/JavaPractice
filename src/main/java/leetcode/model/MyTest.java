package leetcode.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import java.util.Map.Entry;
import java.util.concurrent.atomic.LongAdder;
import org.junit.Test;

/**
 * @author jinsong.Liang
 * @Description
 * @date 2019/9/24 14:17
 */
public class MyTest {
    @Test
    public void test() {
        Map<String, Product> map = new HashMap<>();
        map.put("two", new Product(10, "xiaoli", new BigDecimal(200)));
        map.put("one", new Product(10, "xiaosong", new BigDecimal(100)));
        map.put("four", new Product(10, "xiaohui", new BigDecimal(800)));
        map.put("three", new Product(10, "xiaoqiang", new BigDecimal(500)));
        List<Entry<String,Product>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, Comparator.comparing(o -> o.getValue().getPrice()));
//        list.forEach(System.out::println);
        Map<String,Product> result = new LinkedHashMap<>();
        list.forEach(vo->{
            result.put(vo.getKey(),vo.getValue());
        });
        Iterator<String> iterator = result.keySet().iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next+" "+result.get(next));
        }
    }

    @Test
    public void test2(){
        LongAdder longAdder = new LongAdder();
        longAdder.decrement();
    }
}
