package first;
/**
 * 给定任何一个数字 转化为 英文读名称
 *
 * 青春版
 */

import com.google.common.collect.Lists;
import com.google.common.primitives.Ints;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

public class NumberNames {
    public void numberNamesSolution(int num){
        int[] numArray = {1000000,1000,100,90,80,70,60,50,40,30,20,10,9,8,7,6,5,4,3,2,1};
        String[] nameArray = {"million","thousand","hundred","ninety","eighty","seventy","sixty","fifty","fourty","thirty","twenty"
                            ,"ten","nine","eight","seven","six","five","four","three","two","one"};
        HashMap<Integer,String> map = new HashMap<>();
        ArrayList<Integer> numList = Lists.newArrayList(Ints.asList(numArray));
        ArrayList<String> nameList = Lists.newArrayList(nameArray);
        for (int i = 0; i < numList.size(); i++) {
            map.put(numList.get(i),nameList.get(i));
        }
        String s = nameSolution(num, numArray, map);
        System.out.println(s);
    }

    public String nameSolution(int num,int[] numArray,HashMap<Integer,String> map){
        String result = "";
        for(int i=0;i<numArray.length;i++){
            if(numArray[i]<100){
                result += (num>10?map.get(num-num%10)+" ":"")+map.get(num%10);
                break;
            }
            if(num/numArray[i]!=0){
                int temp = num/numArray[i];
                if(!map.containsKey(temp)){
                    String s = nameSolution(temp, numArray, map);
                    result += s + " " + map.get(numArray[i])+" and ";
                }else{
                    result += map.get(temp) + " " + map.get(numArray[i])+" ";
                }
                num = num%numArray[i];
            }
        }
        return result;
    }

    @Test
    public void numberNamesSolutionyTest(){
        numberNamesSolution(43112603);
    }
}
