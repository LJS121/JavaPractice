package leetcode;

public class ContainWater {
    public int maxArea(int[] height) {
        int maxArea = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int nowArea = (j - i) * (height[i] > height[j] ? height[j] : height[i]);
                if (nowArea > maxArea) {
                    maxArea = nowArea;
                }
            }
        }
        return maxArea;
    }

}
