package leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jinsong.Liang
 * @date 2019/4/1 17:23
 */
public class YuesefuCircle {
    public int getLuckyMan(int num) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            list.add(i);
        }
        int count = 1;
        for (int i = 0; list.size() > 1; i++) {
            if (i == list.size()) {
                i = 0;
            }
            if (count % 3 == 0) {
                list.remove(i--);
            }
            count++;
        }
        return list.get(0);
    }

    @Test
    public void test() {
        System.out.println(getLuckyMan(10));
    }

}
