package leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 给出一个区间的集合，请合并所有重叠的区间。
 * Example：
 * 输入: [[1,3],[2,6],[8,10],[15,18]]
 * 输出: [[1,6],[8,10],[15,18]]
 * 解释: 区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
 *
 * @author jinsong.Liang
 * @date 2019/4/2 14:32
 */

public class MergeInterval {
    public List<Interval> merge(List<Interval> intervals) {
        if(intervals==null||intervals.size()==0){
            return Collections.emptyList();
        }
        List<Interval> result = new ArrayList<>();
        intervals.sort(((o1, o2) -> o1.start-o2.start));
        int start = intervals.get(0).start;
        int end = intervals.get(0).end;
        for (int i = 0; i < intervals.size(); i++) {
            if(intervals.get(i).start<=end){
                end = intervals.get(i).end>end?intervals.get(i).end:end;
            }else{
                result.add(new Interval(start,end));
                start = intervals.get(i).start;
                end = intervals.get(i).end;
            }
        }
        result.add(new Interval(start,end));
        return result;
    }

    @Test
    public void test(){

    }
}

class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
}