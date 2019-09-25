package leetcode;

import org.junit.Test;
import test.CountGenerator.String;

/**
 * @author jinsong.Liang
 * @Description
 * @date 2019/9/23 14:20
 */
public class KMP {
    public int solution(char[] chars,char[] target){
        int index = -1;
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < target.length; j++) {
                if(chars[i] != target[j]){
                    break;
                }
                if(j == target.length-1){
                    index  = j;
                }
            }
            if(index!=-1){
                break;
            }
        }
        return index;
    }

    @Test
    public void test(){
        System.out.println(solution("BBC ABCDAB ABCDABCDABDE".toCharArray(),"ABCDABD".toCharArray()));
    }
}
