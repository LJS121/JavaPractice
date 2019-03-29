package first;
/**
 * 给定一个数字 根据它的逆序 和 正序 相减结果 做迭代
 * 如果结果出现重复 则停止
 */

import org.junit.Test;

import java.util.*;

public class NumberChains {
    public void Solution(int num){
        Set<Integer> set = new HashSet<>();//存放不重复的结果
        List<String> result = new ArrayList<>();//存放打印的结果集
        numberChainsSolution(num,set,result);
        print(result,num);
    }
    private void numberChainsSolution(int num,Set<Integer> set,List<String> result){
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        while(num/10>0){
            list1.add(num%10);
            num /= 10;
        }
        list1.add(num);
        Collections.sort(list1);
        list2.addAll(list1);
        Collections.reverse(list2);
        String s1= "";
        String s2= "";
        for (int i:list1
        ) {
            s1 += i;
        }
        for (int i:list2
        ) {
            s2 += i;
        }
        Integer i1 = Integer.valueOf(s1);
        Integer i2 = Integer.valueOf(s2);
        result.add(""+i2+"-"+i1+"="+(i2-i1));
        if(set.add(i2-i1)){
            numberChainsSolution(i2-i1,set,result);
        }else{
            return;
        }
    }
    private void print(List<String> list,int i){
        System.out.println("原来的号码是："+i);
        for (String s:list
             ) {
            System.out.println(s);
        }
        System.out.println("链长:"+list.size()+"\n");
    }
    @Test
    public void numberChainsSolutionTest(){
        Solution(123456789);
        Solution(2314);
        Solution(444);
    }

}
