package leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 利用康托展开式求解
 * X = an(n-1)! + an-1(n-2)! +...+ a1*0!;
 * ai 表示第i位之后又几个数小于本位
 *
 * @author jinsong.Liang
 * @date 2019/4/2 16:15
 */
public class GetKPermutation2 {
    public String getPermutation(int n, int k) {
        StringBuilder sb = new StringBuilder();
        // 候选数字
        List<Integer> candidates = new ArrayList<>();
        // 分母的阶乘数
        int[] factorials = new int[n+1];
        factorials[0] = 1;
        int fact = 1;
        for(int i = 1; i <= n; ++i) {
            candidates.add(i);
            fact *= i;
            factorials[i] = fact;
        }
        k -= 1;
        for(int i = n-1; i >= 0; --i) {
            // 计算候选数字的index
            int index = k / factorials[i];
            sb.append(candidates.remove(index));
            k -= index*factorials[i];
        }
        return sb.toString();
    }
    @Test
    public void test1(){
        getPermutation(3,3);
    }
}
