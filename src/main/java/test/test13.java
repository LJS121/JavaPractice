package test;

import java.util.Arrays;

public class test13 {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5};
        int[] arr2 = {2,3,4,5};
        arr = arr2;
        System.out.println(Arrays.toString(arr));
    }
}
