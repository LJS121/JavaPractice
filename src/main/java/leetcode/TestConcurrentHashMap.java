package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author jinsong.Liang
 * @Description
 * @date 2019/9/24 9:45
 */

public class TestConcurrentHashMap {

    public static void main(String[] args) {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap(); //初始化ConcurrentHashMap
        //新增个人信息
        map.put("id", "1");
        map.put("name", "andy");
        map.put("sex", "男");
        //获取姓名
        String name = map.get("name");
        Assert.assertEquals(name, "andy");
        //计算大小
        int size = map.size();
        Assert.assertEquals(size, 3);
    }

    @Test
    public void test(){
        Map<String,String> map = new HashMap<>();
        map.put(null, null);

        ConcurrentHashMap<String, String> map2 = new ConcurrentHashMap();
        map2.put(null, null);

    }

    @Test
    public void test3(){
        System.out.println(-2>>>1);
        System.out.println(-2>>>2);
        System.out.println(-1<<2);
    }
}
