package leetcode;

import org.junit.Test;

import java.math.BigInteger;

/**
 * 给定两个以字符串形式表示的非负整数 num1 和 num2，返回 num1 和 num2 的乘积，它们的乘积也表示为字符串形式。
 */
public class multiply {
    public void multiplyString(String num1,String num2){
        BigInteger bi = new BigInteger(num1);
        BigInteger bi2 = new BigInteger(num2);
        BigInteger result = bi.multiply(bi2);
        System.out.println(result.toString());
    }
    @Test
    public void test(){
        multiplyString("2141414145121414141451214141414512141414145112222454464688214141414511222245446468821414141451","12222454464688214141414511222245446468821414141451");
    }
}
