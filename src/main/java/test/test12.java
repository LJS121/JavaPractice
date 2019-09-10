package test;
/**
 * 使用 Arrays.asList 处理int数组的时候出问题 但是处理Integer数组不出问题
 * 所以如果数组中的元素较少 可以穷举 直接用
 * Arrays.asList(arr[0],arr[1],arr[2])即可
 */

import java.util.Arrays;
import java.util.List;

public class test12 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        int m = 1;
        System.out.println(-m);
    }
}
