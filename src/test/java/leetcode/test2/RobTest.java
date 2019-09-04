package leetcode.test2;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jinsong.Liang
 * @Description
 * @date 2019/8/28 14:31
 */
public class RobTest extends BaseTest {
    private Rob rob = new Rob();

    @Test
    public void 数组长度0() {
        Assert.assertTrue(rob.rob(new int[] {}) == 0);
    }

    @Test
    public void 数组长度1() {
        Assert.assertTrue(rob.rob(new int[] {3}) == 3);
    }

    @Test
    public void 数组长度2() {
        Assert.assertTrue(rob.rob(new int[] {3, 5}) == 5);
    }

    @Test
    public void 数组长度大于2() {
        Assert.assertTrue(rob.rob(new int[] {2, 7, 9, 3, 1}) == 12);
    }
}
