package leetcode.BackStrap;
/**
 * StringBuilder.setCharAt()可以设置在某个某位置的值
 */

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NQueen {
    public List<List<String>> solveNQueen(int n){
        if(n<=0){
            return Collections.emptyList();
        }
        List<List<String>> result = new ArrayList<>();
        //充分利用数组 使用一维数组表示出二维数组的感觉 index表示行 queen[index]表示列
        int[] queen = new int[n];
        BackTrace(result,queen,0);
        return result;
    }
    public void BackTrace(List<List<String>> result,int[] queen,int pos){
        //设置结束条件
        if(pos==queen.length){
            List<String> temp = new ArrayList<>();
            for (int i = 0; i < queen.length; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < queen.length; j++) {
                }
                sb.setCharAt(queen[i],'Q');
                temp.add(sb.toString());
            }
            result.add(temp);
            return;
        }
        for (int i = 0; i < queen.length; i++) {
            queen[pos] = i;
            if(isValid(pos,queen)){
                BackTrace(result,queen,pos+1);
            }
        }
    }

    public boolean isValid(int pos,int[] queen){
        for (int i = 0; i < pos; i++) {
            if(queen[pos]==queen[i]){
                return false;
            }
            if(Math.abs((queen[pos]-queen[i]))==(pos-i)){
                return false;
            }
        }
        return true;
    }

    @Test
    public void test(){
        List<List<String>> lists = solveNQueen(4);
        System.out.println(lists.size());
//        lists.forEach(vo-> System.out.println(vo));
    }

}
