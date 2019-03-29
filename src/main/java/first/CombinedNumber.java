package first;

/**
 * 给定一个整数数组 输出的结果是这些整数所能组成的最大数
 *
 * [420,42,423] --> "42423420"
 */
public class CombinedNumber {
    public static void main(String[] args) {
        System.out.println(combinedMax(new int[]{420,42,423}));
    }
    public static String combinedMax(int[] ints){
        for(int i=0;i<ints.length-1;i++){
            for(int j=0;j<ints.length-1-i;j++){
                if(compare(ints[j+1],ints[j])){
                    int temp = ints[j];
                    ints[j] = ints[j+1];
                    ints[j+1] = temp;
                }
            }
        }
        String str = "";
        for (int i:ints
             ) {
            str += i;
        }
        return str;
    }
    public static boolean compare(int m,int n){
        String s1 = ""+m+n;
        String s2 = ""+n+m;
        for (int i = 0; i < m+n; i++) {
            if(s1.charAt(i)>s2.charAt(i)){
                return true;
            }else if(s1.charAt(i)<s2.charAt(i)){
                return false;
            }
        }
        return false;
    }
}
