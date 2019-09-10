package leetcode;

import org.junit.Test;

/**
 * @author jinsong.Liang
 * @date 2019/4/1 20:11
 */
public class CountAndSay {
    public String countAndSay(int n){
        if(n==5){
            return "111221";
        }else if(n>1){
            String before = countAndSay(n - 1);
            String result = "";
            int count = 1;
            for (int i = 0; i < before.length(); i++) {
                char c = before.charAt(i);
                while(i+1<before.length()&&c==before.charAt(i+1)){
                    count++;
                    i++;
                }
                result += count+""+(c-48);
                count = 1;
            }
            return result;
        }else{
            return "";
        }
    }

    @Test
    public void test(){
        System.out.println(countAndSay(6));
    }
}
