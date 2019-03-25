package Try;
/**
 * 找到一个数的素因子  并使得素因子相乘等于原数
 */

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public List primeFactorsSolution(int n) throws Exception {
        List<Integer> list = new ArrayList<>();
        if(n<=1){
            throw new Exception("输入范围有误");
        }
        if(n==2||n==3){
            list.add(n);
            return list;
        }else{
            for (int i = 2; i <= n/2; i++) {
                if(n%i==0&&prime(i)){
                    list.add(i);
                    n /= i;
                }
            }
            if(n!=1){
                list.addAll(primeFactorsSolution(n));
            }
        }
        return list;
    }
    public boolean prime(int n){
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    @Test
    public void primeFactorsSolutionTest() throws Exception {
        List list = primeFactorsSolution(4);
        System.out.println(list.toString());
    }
}
