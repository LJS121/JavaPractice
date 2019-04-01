package leetcode;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author jinsong.Liang
 * @date 2019/4/1 9:58
 */
public class ReverseInteger3 {
    public int reverse(int x) {
        ArrayList<Character> list = new ArrayList<>();
        int positive = Math.abs(x);
        String s = String.valueOf(positive);
        int index = 0;
        while (index < s.length()) {
            list.add(s.charAt(index++));
        }
        Collections.reverse(list);
        String ss = new String();
        for (char c : list) {
            ss += c;
        }
        long aLong = Long.valueOf(ss);
        if(aLong>Integer.MAX_VALUE||aLong<= Integer.MIN_VALUE){
            return 0;
        }else{
            return x>0?(int)aLong:(int)-aLong;
        }
    }

}
