package leetcode;

import org.junit.Test;

public class ReverseInteger {
    public int reverse(int x) {
        int temp = Math.abs(x);
        int result = 0;
        while (temp / 10 > 0) {
            result = (result + temp % 10) * 10;
            temp /= 10;
        }
        result += temp;
        if(x<0){
            return -result;
        }else{
            return result;
        }
    }
    @Test
    public void test(){
        System.out.println(reverse(1534236469));
        System.out.println(reverse(-123));
    }
}
