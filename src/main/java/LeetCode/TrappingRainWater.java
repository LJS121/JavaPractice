package LeetCode;

/**
 * 艰难完成。。。。。。。。。。。。。。。
 * 写的复杂的一批 但也算写出来了 值得鼓励。
 * @author jinsong.Liang
 * @date 2019/3/28 16:31
 */
public class TrappingRainWater {
    public int trap(int[] height) {
        int sum = 0;

        for (int i = 0; i < height.length-1; i++) {
            //不需要上流
            if(height[i]<=height[i+1]){
                continue;
            }

            int j = i+1;

            //通过比较去找最低的坡
            while(j+1<height.length&&height[j]>=height[j+1]){
                j++;
            }
            if(j==height.length-1){//如果低坡没有上升 直接结束
                return sum;
            }

            //到达坡底之后去找上坡
            while(j+1<height.length&&height[j]<height[j+1]){
                j++;
            }

            int min = Math.min(height[i],height[j]); //去比较这个沟的两端谁更低
            for (int k = i+1; k < j; k++) {
                if(height[k]<min){
                    sum += min-height[k];
                    height[k] = min;
                }
            }
            if(height[j]<height[i]){//如果左端点更高 i的值还得再来一遍
                i--;
            }else{
                i=j-1;
            }
        }

        return sum;
    }
}
