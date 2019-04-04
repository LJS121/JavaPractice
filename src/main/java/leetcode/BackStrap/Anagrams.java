package leetcode.BackStrap;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author jinsong.Liang
 * @date 2019/4/1 16:02
 */
public class Anagrams {
    public List<String> sort(String s) {
        Set<String> result = new HashSet<>();
        char[] chars = s.toCharArray();
        sort(chars, result, 0);
        return new ArrayList<>(result);
    }

    public void sort(char[] chars, Set<String> result, int index) {
        if (index == chars.length - 1) {
            result.add(String.valueOf(chars));
            return;
        } else {
            for (int i = index; i < chars.length; i++) {
                swap(chars, i, index);
                sort(chars, result, index + 1);
                swap(chars, i, index);
            }
        }
    }

    private void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    @Test
    public void test() {
        List<String> strings = sort("abcd");
        Assert.assertEquals(strings.size(), 24);
    }

    @Test
    public void test1() {
        List<String> strings1 = sort("abcc");
        Assert.assertEquals(strings1.size(), 24);
    }
}
