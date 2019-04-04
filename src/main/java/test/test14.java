package test;

/**
 * @author jinsong.Liang
 * @date 2019/4/2 18:09
 */
public class test14 {
    public static void main(String[] args) {
        final char[] chars = {'a','b','c','d'};
        chars[0] = 'm';
        System.out.println(chars[0]);
        String s1 = "abc" + "de";
        String s2 = "abcd" + "e";
        ma(s1, s2);
        ma(s1, s2);
        ma(s1, s2);
        ma(s1, s2);
        ma(s1, s2);
        ma(s1, s2);
    }

    private static void ma(String s1, String s2) {
        System.out.println(s1 == s2);
    }

}
