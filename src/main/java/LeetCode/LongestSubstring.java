package LeetCode;

import org.junit.Test;
import java.util.HashSet;
import java.util.Set;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 * @author jinsong.Liang
 * @date 2019/3/28 15:16
 */

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            int temp = 0,j=i;
            Set<Character> set = new HashSet<>();
            while(j<s.length()&&set.add(s.charAt(j++))){
                temp++;
            }
            maxLen = maxLen>temp?maxLen:temp;
        }
        return maxLen;
    }
    @Test
    public void lengthOfLongestSubstringTest(){
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("abcabcbb"));

    }
}
