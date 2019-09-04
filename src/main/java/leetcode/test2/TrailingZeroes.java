package leetcode.test2;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * @author jinsong.Liang
 * @Description
 * @date 2019/8/27 16:54
 */
public class TrailingZeroes {
    public int trailingZeroes(int n) {
        BigDecimal bigDecimal = new BigDecimal(1);
        for (int i = 1; i <= n; i++) {
            bigDecimal = bigDecimal.multiply(new BigDecimal(i));
        }
        int count = 0;
        for (int i = bigDecimal.toString().length() - 1; i >= 0; i--) {
            if (bigDecimal.toString().charAt(i) != '0') {
                break;
            }
            count++;
        }
        return count;
    }

    @Test
    public void test() {
        System.out.println(trailingZeroes_2(3728));
        System.out.println(trailingZeroes_2(25));
    }

    public int trailingZeroes_2(int n) {
        return n == 0 ? 0 : n / 5 + trailingZeroes_2(n / 5);
    }
}
