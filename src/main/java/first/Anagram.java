package first;

import org.junit.Test;

import java.util.ArrayList;

public class Anagram {
    public static ArrayList<String> permutation(String str) {
        ArrayList<String> list = new ArrayList<>();
        char[] chars = str.toCharArray();
        permutation(chars, list, 0);
        return list;
    }

    public static void permutation(char[] chars, ArrayList<String> list, int i) {
        if (i >= chars.length) {
            return;
        }
        if (i == chars.length - 1) {
            list.add(String.valueOf(chars));
        } else {
            for (int j = i; j < chars.length; j++) {
                swap(chars, i, j);

                permutation(chars, list, i + 1);

                swap(chars, i, j);
            }
        }
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[j];
        chars[j] = chars[i];
        chars[i] = temp;
    }

    @Test
    public void permutationTest() {
        //given
        String str = "bir";
        //when
        ArrayList<String> permutation = permutation(str);
        //then
        for (String s : permutation
        ) {
            System.out.println(s);
        }
    }
}
