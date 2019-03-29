package leetcode;

public class ContainWater {
    public int maxArea(int[] num){
        int maxArea = 0;
        for (int i = 0; i < num.length-1; i++) {
            for (int j = i+1; j < num.length; j++) {
                int nowArea = (j-i)*(num[i]>num[j]?num[j]:num[i]);
                if(nowArea>maxArea){
                    maxArea = nowArea;
                }
            }
        }
        return maxArea;
    }

}
