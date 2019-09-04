package leetcode.test2;

import org.junit.Test;


/**
 * @author jinsong.Liang
 * @Description
 * @date 2019/8/27 16:27
 */
public class IsPowerOfTwo {
    public boolean isPowerOf2(int n) {
        if (n == 1)
            return true;
        if (n >= 2 && n % 2 == 0)
            return isPowerOf2(n / 2);
        return false;
    }

    public boolean isPowerOf2_2(int n) {
        return n > 0 && ((n & (n - 1)) == 0);
    }

    @Test
    public void test() {
        System.out.println(~2);
        System.out.println(1 ^ 2);
        System.out.println(1 & 2);
    }
}
