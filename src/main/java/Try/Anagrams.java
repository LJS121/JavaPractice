package Try;

/**
 *给定一个字符串，给出它的所有排列
 */
public class Anagrams {
    public static int count = 0;
    public static void main(String[] args) {
        String str = "nihao";
        permutation(str,0);
        System.out.println(count);
    }
    public static void permutation(String str,int i){
        char[] chars = str.toCharArray();
        permutation(chars,i);
    }
    public static void permutation(char[] chars,int i){
        if(i>=chars.length){
            return;
        }
        if(i==chars.length-1){
            System.out.println(String.valueOf(chars));
            count++;
        }
        else{
            for(int j=i;j<chars.length;j++){
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;

                permutation(chars,i+1);

                temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
            }
        }
    }
}
