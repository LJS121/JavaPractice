package leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jinsong.Liang
 * @date 2019/4/1 15:03
 */
public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateOneByOne("", result, n, n);
        return result;
    }

    private void generateOneByOne(String subList, List<String> result, int left, int right) {
        //退出条件
        if (left == 0 && right == 0) {
            result.add(subList);
            return;
        }
        if (left > 0) {
            generateOneByOne(subList, result, left - 1, right);
        }
        if (right > left) {
            generateOneByOne(subList, result, left, right - 1);
        }
    }

    @Test
    public void test() {
        List<String> strings = generateParenthesis(4);
        System.out.println(strings.size());
    }
}
