package leetcode;
/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 * Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−2^31,  2^31 − 1].
 * For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 */

import org.junit.Test;

public class ReverseInteger {
    public int reverse(int x) {
        int temp = Math.abs(x);
        long result = 0;
        while (temp / 10 > 0) {
            result = (result + temp % 10) * 10;
            temp /= 10;
        }
        result += temp;
        if(result>Integer.MAX_VALUE||result<=Integer.MIN_VALUE){
            return 0;
        }else{
            return x>0?(int)result:(int)-result;
        }
    }
    @Test
    public void test(){
        System.out.println(reverse(1534236469));
        System.out.println(reverse(-123));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}
