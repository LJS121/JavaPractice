package Try;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicates {
    public List<Integer> duplicatesSolution(List<Integer> list){
        List<Integer> newList = new ArrayList<>();
        for (int i:list
             ) {
            if(!newList.contains(i)){
                newList.add(i);
            }
        }
        return newList;
    }

    @Test
    public void duplicatesSolutionTest(){
        //given
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        //when
        List<Integer> newList = duplicatesSolution(list);
        //then
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < newList.size(); i++) {
            //如果有重复 说明排重方法失败 断言出现错误
            Assert.assertEquals(true,set.add(newList.get(i)));
        }

    }
}
