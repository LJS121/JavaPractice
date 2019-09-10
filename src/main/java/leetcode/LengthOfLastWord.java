package leetcode;

/**
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
 *
 * 如果不存在最后一个单词，请返回 0 。
 *
 * 说明：一个单词是指由字母组成，但不包含任何空格的字符串。
 *
 * @author jinsong.Liang
 * @date 2019/4/2 15:07
 */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        if(s==null){
            return 0;
        }
        String temp = s.trim();
        int result = 0;
        for (int i = temp.length()-1; i >= 0; i--) {
            if(temp.charAt(i)!=' '){
                result++;
                continue;
            }
            if(temp.charAt(i)==' '){
                break;
            }
        }
        return result;
    }
}
