package Try;
/**
 * 判断给定的号码list是否满足一致性
 * 如果一个号码是另一个号码的前缀 则不满足一致性条件
 *
 * 误区：不能自己和自己做 startWith
 */

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PhoneNumbers {
    public boolean consistentJudge(List<String> list){
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if(i==j){
                    continue;
                }
                if(list.get(i).startsWith(list.get(j))){
                    return false;
                }
            }
        }
        return true;
    }

    @Test
    public void consistentJudgeTest(){
        //given
        List<String> list = new ArrayList<>();
        list.add("91125426");
        list.add("911");
        list.add("9135845");
        Assert.assertEquals(false,consistentJudge(list));

    }
}
