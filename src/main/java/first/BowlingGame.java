package first;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author jinsong.Liang
 * @date 2019/3/29 10:49
 */
public class BowlingGame {
    public int bowlingGame(String strings) {
        int j = 0;
        int score = 0;
        int[] flag = new int[10];
        List<List<Integer>> list = new ArrayList<>();
        HashMap<Character, Integer> map = new HashMap<>();
        mapping(map);
        for (int i = 0; i < 10; i++) {
            List<Integer> temp = new ArrayList<>();
            while (strings.charAt(j) != '|') {
                char c = strings.charAt(j);
                if (c == 'X') {
                    flag[i] = 2;
                    j += 1;
                    temp.add(map.get(c));
                } else if (c >= '1' && c <= '9') {
                    char next = strings.charAt(j + 1);
                    if (next == '-') {//下一球miss
                        flag[i] = 0;
                        j += 2;
                        temp.add(map.get(c));
                        temp.add(0);
                    } else if (next == '/') {//下一球打满 10
                        flag[i] = 1;
                        j += 2;
                        temp.add(map.get(c));
                        temp.add(10-map.get(c));
                    }
                } else if (c == '-') {
                    char next = strings.charAt(j + 1);
                    if (next == '-') {//下一球miss
                        flag[i] = 0;
                        j += 2;
                        temp.add(0);
                        temp.add(0);
                    } else if (next >= '1' && next <= '9') {
                        flag[i] = 0;
                        j += 2;
                        temp.add(0);
                        temp.add(map.get(next));
                    } else if (next == '/') {//下一球打满 10
                        flag[i] = 1;
                        j += 2;
                        temp.add(0);
                        temp.add(10);
                    }
                }
            }
            list.add(temp);
            j += 1;
        }

        List<Integer> temp = new ArrayList<>();
        while (j + 1 <= strings.length() - 1) {
            if (strings.charAt(j + 1) == 'X') {
                temp.add(10);
            } else {
                temp.add(map.get(strings.charAt(j+1)));
            }
            j++;
        }
        list.add(temp);

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int sum = 0;
            if (flag[i] == 0) {
                List<Integer> cur = list.get(i);
                for (int k : cur
                ) {
                    sum += k;
                }
            } else if (flag[i] == 1) {
                List<Integer> cur = list.get(i);
                if (i + 1 < list.size()) {
                    List<Integer> next = list.get(i + 1);
                    for (int k : cur) {
                        sum += k;
                    }
                    sum += next.get(0);
                }

            } else if (flag[i] == 2) {
                List<Integer> cur = list.get(i);
                if (i + 2 < list.size()) {
                    List<Integer> next = list.get(i + 1);
                    for (int k : cur
                    ) {
                        sum += k;
                    }
                    if (next.size() < 2) {
                        List<Integer> nextTwo = list.get(i + 2);
                        sum += (next.get(0) + nextTwo.get(0));
                    } else {
                        sum += next.get(0) + next.get(1);
                    }
                }
                if (i + 1 == list.size() - 1) {
                    List<Integer> next = list.get(i + 1);
                    for (int k : cur
                    ) {
                        sum += k;
                    }
                    sum += next.get(0) + next.get(1);
                }
            }
            result.add(sum);
        }

        for (int i = 0; i < result.size(); i++) {
            score += result.get(i);
        }
        return score;
    }

    private void mapping(HashMap<Character, Integer> map) {
        map.put('0', 0);
        map.put('1', 1);
        map.put('2', 2);
        map.put('3', 3);
        map.put('4', 4);
        map.put('5', 5);
        map.put('6', 6);
        map.put('7', 7);
        map.put('8', 8);
        map.put('9', 9);
        map.put('X', 10);
    }

    @Test
    public void test() {
        System.out.println(bowlingGame("5/|5/|5/|5/|5/|5/|5/|5/|5/|5/||5"));
        System.out.println(bowlingGame("X|7/|9-|X|-8|8/|-6|X|X|X||81"));
        System.out.println(bowlingGame("X|X|X|X|X|X|X|X|X|X||XX"));
        System.out.println(bowlingGame("9-|9-|9-|9-|9-|9-|9-|9-|9-|9-||"));
    }

}
