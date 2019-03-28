package test;
/**
 * 没有赋值的String 类型被当作 ""空串处理
 * 没有赋值的String[] 当作null处理
 */

import java.util.Arrays;

public class test13 {
    public static void main(String[] args) {
//        int[] arr = {1,3,4,5};
//        int[] arr2 = {2,3,4,5};
//        arr = arr2;
//        System.out.println(Arrays.toString(arr));
        String[] s = new String[3];
        System.out.println(s[0]==null);
        String ss = new String();
        System.out.println(ss.equals(""));
    }
}
