package leetcode.test2;

import org.junit.Test;

/**
 * @author jinsong.Liang
 * @Description
 * @date 2019/8/27 15:50
 */
public class IsPowerOfThree {
    public boolean isPowerOf3(int n) {
        if (n == 1)
            return true;
        while (n > 3 && n % 3 == 0) {
            n = n / 3;
        }
        return n == 3;
    }

    public boolean isPowerOf3_2(int n) {
        if (n == 1)
            return true;
        if (n >= 3 && n % 3 == 0)
            return isPowerOf3_2(n / 3);
        return false;
    }

    public boolean isPowerOf3_3(int n) {
        return n > 0 && 1162261467 % n == 0;
    }

    public boolean isPowerOfThree_4(int n) {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            if (Math.pow(3, i) > n) break;
            if (Math.pow(3, i) == n) return true;
        }
        return false;
    }

    @Test
    public void test() {
        System.out.println(isPowerOf3(27));
        System.out.println(isPowerOf3(19684));
    }

    @Test
    public void test2() {
        System.out.println(isPowerOfThree_4(27));
        System.out.println(isPowerOfThree_4(19684));
    }
}
