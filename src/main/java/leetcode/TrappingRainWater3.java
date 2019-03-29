package leetcode;

/**
 * 自己改版
 * @author jinsong.Liang
 * @date 2019/3/28 18:33
 */
public class TrappingRainWater3 {
    public int trap(int[] height){
        int fallIndex = 0;
        int sum = 0;
        for (int i = 1; i < height.length; i++) {
           if(height[i]>height[i-1]){
               int min = Math.min(height[i],height[fallIndex]);
               for (int j = fallIndex+1; j < i; j++) {
                   if(height[j]<min){
                       sum += min-height[j];
                       height[j] = min;
                   }
               }
           }
           fallIndex = height[i]>height[fallIndex]?i:fallIndex;
        }
        return sum;
    }
}
