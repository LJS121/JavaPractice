package leetcode.test2;

import java.util.Scanner;

/**
 * @author jinsong.Liang
 * @Description
 * @date 2019/8/26 15:26
 */
public class DivGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            boolean[] dp = new boolean[n + 1];
            dp[2] = true;
            if (n >= 3) {
                for (int i = 3; i < n + 1; i++) {
                    for (int j = 1; j < i; j++) {
                        if (i % j == 0 && !dp[i - j]) {
                            dp[i] = true;
                            break;
                        }
                    }
                }
            }
            System.out.println(dp[n]);
        }
    }
}
