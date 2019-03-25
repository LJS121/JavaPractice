package ReDo;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

public class Anagrams2 {
    public static List<String> of(String b) {
        List<String> list = new ArrayList<>();
        if (b.length() == 1) {
            ArrayList<String> strings = Lists.newArrayList(b);
            list.addAll(strings);
        } else if (b.length() >= 2) {
            for (int i = 0; i < b.length(); i++) {
                String cur = "" + b.charAt(i);
                //这里不能用replace方法 只能用substring 因为replace会替换所有出现过的 如果原串有重复 而subString不需要做i+1的判断和0==i的判断
                List<String> before = of(b.substring(0,i)+b.substring(i+1));
                for (String tempRest : before) {
                    if(!list.contains(cur + tempRest)){
                        list.add(cur+tempRest);
                    }
                }
            }
        }
        return list;
    }
}
