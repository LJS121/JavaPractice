package leetcode;

import org.junit.Test;

/**
 * @author jinsong.Liang
 * @date 2019/4/1 14:09
 */
public class MultiplyStrings3 {
    public String multiply(String num1, String num2) {
        int m = num1.length(), n = num2.length();
        int[] pos = new int[m + n];
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - 48) * (num2.charAt(j) - 48);
                int p1 = i + j, p2 = i + j + 1;
                int sum = mul + pos[p2];

                pos[p1] += sum / 10;
                pos[p2] = sum % 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i : pos) {
            if (!(sb.length() == 0 && i == 0)) {
                sb.append(i);
            }
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }

    @Test
    public void test() {
        System.out.println(multiply("3288", "2769"));
    }
}
