package leetcode;

/**
 *不用String.indexOf() 却能实现 它的功能 并且考虑 haystack为空 和 needle 为空的情况
 * needle为空 返回0 找不到返回 -1
 * @author jinsong.Liang
 * @date 2019/3/28 16:10
 */
public class ImplementstrStr3 {
    public int Solution(String haystack,String needle){
        if(needle.isEmpty()){
            return 0;
        }
        for (int i = 0; i < haystack.length(); i++) {
            int j=needle.length();
            if(i+j<=haystack.length()&&haystack.substring(i,i+j).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
