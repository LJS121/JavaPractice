package leetcode;

/**
 * copy别人的 复杂度比我写的低很多
 * 但是不好想
 * @author jinsong.Liang
 * @date 2019/3/28 17:34
 */
public class TrappingRainWater2 {
    public int trap(int[] height) {
        if (height.length <= 2) {
            return 0;
        }

        // the number of trapping rain water
        int sum = 0;
        // the index of the wall(the wall is the maximum value during the sequential traverse)
        int wallIndex = 0;

        for (int i=1; i<height.length; i++) {
            // rain water can be trapped only when the current elevation greater than the previous elevation
            if (height[i] > height[i-1]) {
                // the minimum of the height[i] and height[wallIndex] is used as the fill boundary
                int fill = Math.min(height[i], height[wallIndex]);

                // count the number of trapped rain water and fill the pit
                for (int j=i-1; j>wallIndex && height[j]<fill; j--) {
                    sum += (fill - height[j]);
                    height[j] = fill;
                }

                // refresh the index of the wall
                wallIndex = height[wallIndex] > height[i] ? wallIndex : i;
            }
        }

        return sum;
    }

}
