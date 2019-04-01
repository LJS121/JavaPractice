package leetcode;

import org.junit.Test;

/**
 * @author jinsong.Liang
 * @date 2019/3/28 15:40
 */
public class ImplementstrStr {
    public int strStr(String haystack, String needle) {
        if (haystack.length() == 0) {
            if (needle.length() == 0) {
                return 0;
            } else {
                return -1;
            }
        }
        for (int i = 0; i < haystack.length(); i++) {
            int j = 0, k = i;
            while (j < needle.length() && k < haystack.length() && haystack.charAt(k) == needle.charAt(j)) {
                k++;
                j++;
            }
            if (j == needle.length()) {
                return i;
            } else {
                j = 0;
            }
        }
        return -1;
    }

    @Test
    public void strStrTest() {
        System.out.println(strStr("hello", "ll"));
        System.out.println(strStr("hello", ""));
        System.out.println(strStr("hello", "a"));
    }
}
