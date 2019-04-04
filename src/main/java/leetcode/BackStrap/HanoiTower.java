package leetcode.BackStrap;

import org.junit.Test;

/**
 * 汉诺塔问题
 *
 * @author jinsong.Liang
 * @date 2019/4/1 15:50
 */
public class HanoiTower {
    public void hanoi(int n, char from, char tmp, char to) {
        if (n > 0) {
            hanoi(n - 1, from, to, tmp);
            System.out.println("take " + n + " from " + from + " to　" + to);
            hanoi(n - 1, tmp, from, to);
        }
    }

    @Test
    public void test() {
        hanoi(50, 'x', 'z', 'y');
    }
}
