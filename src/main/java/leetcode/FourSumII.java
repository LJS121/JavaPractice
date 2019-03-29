package leetcode;
/**
 * FourSumII的错误实现版本 1.0
 */

import org.junit.Test;

import java.util.Arrays;

public class FourSumII {
    public int fourSumCount(int[] A,int[] B,int[] C,int[] D){
        int count = 0;
        int len = A.length;
        Arrays.sort(A);
        Arrays.sort(B);
        Arrays.sort(C);
        Arrays.sort(D);
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                int k = 0;
                int m = len-1;
                while(k<len&&m>=0){
                    int sum = A[i]+B[j]+C[k]+D[m];
                    if(sum==0){
                        boolean temp1 = k+1<len&&C[k+1]==C[k];
                        boolean temp2 = m-1>=0&&D[m-1]==D[m];
                        count++;
                        if(temp1&&temp2){
                            count += 2;
                            k++;m--;
                            continue;
                        }
                        if(temp1){
                            k++;
                            continue;
                        }
                        if(temp2){
                            m--;
                            continue;
                        }
                        k++;m--;
                    }
                    if(sum<0){
                        k++;
                    }
                    if(sum>0){
                        m--;
                    }
                }
            }
        }
        return count;
    }

    @Test
    public void fourSumCountTest(){
        int[] A = {1,2};
        int[] B = {-2,-1};
        int[] C = {-1,2};
        int[] D = {0,2};

        System.out.println(fourSumCount(A, B, C, D));
    }
}
