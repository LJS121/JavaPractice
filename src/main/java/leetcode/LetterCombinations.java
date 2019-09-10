package leetcode;

import org.junit.Test;

import java.util.*;

/**
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
 * <p>
 * A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
 */

/**
 * @author jinsong.Liang
 * @date 2019/4/1 10:52
 */
public class LetterCombinations {
    Map<Character, List<String>> map = new HashMap<>();

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return Collections.emptyList();
        } else {
            initMapping(map);
            return letterCombinations(digits, 0);
        }
    }

    private List<String> letterCombinations(String digits, int index) {
        List<String> current = map.get(digits.charAt(index));
        if (index == digits.length() - 1) {
            return current;
        } else {
            List<String> result = new ArrayList<>();
            List<String> child = letterCombinations(digits, index + 1);
            for (String letter : current) {
                for (String childLetter : child) {
                    result.add(letter + childLetter);
                }
            }
            return result;
        }
    }

    private void initMapping(Map<Character, List<String>> map) {
        map.put('2', Arrays.asList("a", "b", "c"));
        map.put('3', Arrays.asList("d", "e", "f"));
        map.put('4', Arrays.asList("g", "h", "i"));
        map.put('5', Arrays.asList("j", "k", "l"));
        map.put('6', Arrays.asList("m", "n", "o"));
        map.put('7', Arrays.asList("p", "q", "r", "s"));
        map.put('8', Arrays.asList("t", "u", "v"));
        map.put('9', Arrays.asList("w", "x", "y", "z"));
    }

    @Test
    public void test() {
        List<String> strings = letterCombinations("235");
        for (String s : strings) {
            System.out.print(s + "\t");
        }
        System.out.println(strings.size());
    }
}
