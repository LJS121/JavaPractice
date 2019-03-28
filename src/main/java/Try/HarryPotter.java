package Try;

import com.google.common.primitives.Ints;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author jinsong.Liang
 * @date 2019/3/28 11:05
 */
public class HarryPotter {
    int price = 8;//欧元
    public double harryPotter(int[] nums){//传入每本书购买数量的数组
        if(nums.length!=5){
            System.out.println("请你输入五本书购买数量的数组");
            return 0;
        }
        List<Integer> input = Ints.asList(nums);
        Collections.sort(input);
        Collections.reverse(input);//我想要倒序排列的
        int[] count = new int[nums.length];
        for (int i = 0; i < input.size(); i++) {
            count[i] = input.get(i);
        }
        //分别给每个list赋值
        int count5 = 0,count3 = 0;
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < input.get(0); i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < count.length; j++) {
                if(count[j]-->0){
                    temp.add(1);
                }
            }
            list.add(temp);
            if(temp.size()==5){
                count5++;
            }
            if(temp.size()==3){
                count3++;
            }
        }

        //5 3 变成 4 4
        int min = count3>count5?count5:count3;
        double change = min*(5*price*0.75+3*price*0.9-4*price*0.8*2);
        double origin = calculateAll(list);
        return origin-change;
    }
    public double calculateAll(List<List<Integer>> listAll){
        double sum = 0;
        for (List<Integer> list:listAll
             ) {
            switch(list.size()){
                case 5:
                    sum += list.size()*price*0.75;
                    continue;
                case 4:
                    sum += list.size()*price*0.80;
                    continue;
                case 3:
                    sum += list.size()*price*0.9;
                    continue;
                case 2:
                    sum += list.size()*price*0.95;
                    continue;
                default:
                    sum += list.size()*price;
            }
        }
        return sum;
    }

    @Test
    public void test(){
        int[] nums = {1,3,2,4,5};
        System.out.println(harryPotter(nums));
    }
}
