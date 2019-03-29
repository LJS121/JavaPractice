package leetcode;

import org.junit.Test;

/**
 * @author jinsong.Liang
 * @date 2019/3/28 19:23
 */
public class ZigZagConversion {
    public String convert(String s, int numRows) {
        String result = "";
        if(numRows==1){
            return s;
        }
        for (int k = 0; k < numRows; k++) {
            int pos = 0;
            StringBuilder temp = new StringBuilder();
            for (int i = k; i < s.length(); ) {
                temp.append(s.charAt(i));
                int[] offset = {2 * k, 2 * (numRows - 1 - k)};
                if (k == 0 || k == numRows - 1) {
                    i += 2 * (numRows - 1);
                } else {
                    pos = (pos + 1) % 2;
                    i += offset[pos];
                }
            }
            result += temp;
        }
        return result;
    }

    @Test
    public void test() {
        String s = "A";
        String convert = convert(s, 1);
        System.out.println(convert);
    }
}
