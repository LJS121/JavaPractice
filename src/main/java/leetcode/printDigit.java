package leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jinsong.Liang
 * @date 2019/4/1 15:23
 */
public class printDigit {
    public void print(int num) {
        List<Integer> list = new ArrayList<>();
        print(list, num);
        String s = "";
        for (int i = 0; i < list.size(); i++) {
            if (!(list.get(i) == 0 && s.length() == 0)) {
                s += list.get(i);
                System.out.print(list.get(i));
            }
        }
    }

    public void print(List<Integer> list, int num) {
        if (num > 10) {
            list.add(num % 10);
            print(list, num / 10);
        } else {
            list.add(num);
        }
    }


    @Test
    public void test() {
        print(123000);
    }
}
