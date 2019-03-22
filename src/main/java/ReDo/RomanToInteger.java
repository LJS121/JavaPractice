package ReDo;
/**
 * 倒序查看 如果 当前大于或等于之前的map value值 则加 否则减
 */

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(transfer("MDCCCLXXXVIII"));
    }
    public static int transfer(String str){
        HashMap<String,Integer> map = new HashMap<>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);

        if(str==null||str.length()==0){
            return -1;
        }
        int end = str.length()-1;
        int result = map.get(str.substring(end,end+1));
        for(int i=end-1;i>=0;i--){
            if(map.get(str.substring(i,i+1))>=map.get(str.substring(i+1,i+2))){
                result += map.get(str.substring(i,i+1));
            }else{
                result -= map.get(str.substring(i,i+1));
            }
        }
        return result;
    }

}
