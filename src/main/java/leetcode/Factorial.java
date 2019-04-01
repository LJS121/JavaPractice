package leetcode;

import org.junit.Test;

import java.math.BigInteger;

/**
 * 求出1000！的所有0的个数
 *
 * @author jinsong.Liang
 * @date 2019/4/1 16:58
 */
public class Factorial {
    public void factorial() {
        BigInteger bi = new BigInteger("1");
        for (int i = 1; i <= 1000; i++) {
            BigInteger bi2 = new BigInteger(i + "");
            bi = bi.multiply(bi2);
        }
        int count = 0;
        String s = bi.toString();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                count++;
            }
        }
        System.out.println(count);
    }

    public int recursion(int num) {
        if (num < 5 && num >= 0) {
            return 0;
        } else {
            return num / 5 + recursion(num / 5);
        }
    }

    @Test
    public void test() {
        factorial();
        System.out.println(recursion(1000));
        System.out.println(recursion(0));
    }
}
