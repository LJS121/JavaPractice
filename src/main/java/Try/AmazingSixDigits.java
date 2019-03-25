package Try;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 神奇六位数 乘123456都只改变自己的顺序 而不产生新的数字
 */
public class AmazingSixDigits {
    public static void main(String[] args) {
        findAmazingSixDigits();
    }
    public static void findAmazingSixDigits(){
        for(int i=100000;i<1000000/6;i++){
            if(check(i,1)){
                if(check(i,2)){
                    if(check(i,3)){
                        if(check(i,4)){
                            if(check(i,5)){
                                if(check(i,6)){
                                    System.out.println(i);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    public static boolean check(long n,int i){
        char[] newValue = String.valueOf(n*i).toCharArray();
        char[] oldValue = String.valueOf(n).toCharArray();
        ArrayList<Character> a1 = new ArrayList<>();
        ArrayList<Character> a2 = new ArrayList<>();
        for (char c:newValue
             ) {
            a1.add(c);
        }
        for (char c:oldValue
             ) {
            a2.add(c);
        }
        Collections.sort(a1);
        Collections.sort(a2);

        if(a1.toString().equals(a2.toString())){
            return true;
        }else {
            return false;
        }
    }
}
