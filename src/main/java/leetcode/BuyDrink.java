package leetcode;

import org.junit.Test;

/**
 * @author jinsong.Liang
 * @date 2019/4/1 17:39
 */
public class BuyDrink {
    public int buy(int drink, int cap, int bottle) {
        cap += drink;
        bottle += drink;
        if (cap < 3 && bottle < 2 && drink <= 1) {
            return drink;
        } else {
            int nextDrink = cap / 3 + bottle / 2;
            cap %= 3;
            bottle %= 2;
            return buy(nextDrink, cap, bottle) + drink;
        }
    }

    @Test
    public void test() {
        System.out.println(buy(20, 0, 0));
    }
}
