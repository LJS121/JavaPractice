package LeetCode;
/**
 * FourSumII的正确实现版本 3.0
 */

import java.util.Arrays;

public class FourSumII3 {
    public int fourSumII3(int[] A,int[] B,int[] C,int[] D){
        int[] AB = new int[A.length*B.length];
        int[] CD = new int[C.length*D.length];
        int index1 = 0;
        int index2 = 0;
        for (int i:A
             ) {
            for (int j:B
                 ) {
                AB[index1++] = i+j;
            }
        }
        for (int m:C
             ) {
            for (int n:D
                 ) {
                CD[index2++] = -(m+n);
            }
        }

        Arrays.sort(AB);
        Arrays.sort(CD);

        int i = 0;
        int j = 0;
        int result = 0;
        while(i<AB.length&&j<CD.length){
            if(AB[i]>CD[j]){
                j++;
            }else if(AB[i]<CD[j]){
                i++;
            }else{
                int countAB = 1,countCD = 1;
                while(++i<AB.length&&AB[i]==AB[i-1]){
                    countAB++;
                }
                while(++j<CD.length&&CD[j]==CD[j-1]){
                    countCD++;
                }
                result += countAB*countCD;
            }
        }
        return result;
    }
}
