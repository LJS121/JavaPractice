package first;
/**
 * 给定一串数字
 * 判断是否存在这三个元素，它们将数字串分为四个子串，其中每个子串的数字之和均相同(该3个元素不纳入计算)
 * 要求时间复杂度和空间复杂度均不能超过O(n)
 */

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class NumberSplit {
    @Test
    public void fun1() {
        new fun("14514514514").print();
        new fun("11").print();
    }

    public class fun {
        Integer total;
        String str;
        Integer[] arr;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        Integer[] splitIndex = {0, 0, 0};
        boolean checkInt = true;

        public fun(String str) {
            this.str = str;
            arr = new Integer[str.length()];
            int sum = 0;
            for (int index = 0; index < str.length(); index++) {
                if (this.str.charAt(index) < 48 || this.str.charAt(index) > 57) {
                    this.checkInt = false;
                    return;
                }
                sum += this.str.charAt(index) - 48;
                arr[index] = sum;
                map.put(sum, index);
            }
        }

        public boolean excute() {
            boolean flag = false;
            total = arr[arr.length - 1] / 4;
            for (int index = 0; index < arr.length; index++) {
                if (index == 0) {
                    continue;
                }
                if (arr[index] > total) {
                    break;
                }
                int _total = arr[index];
                //找第二个元素
                int _secondSum = arr[index + 1] + _total;
                if (map.get(_secondSum) != null) {
                    int _secondIndex = map.get(_secondSum) + 1;
                    int _threeSum = arr[_secondIndex] + _total;
                    //找到第三个元素
                    if (map.get(_threeSum) != null) {
                        int _threeIndex = map.get(_threeSum) + 1;
                        if (arr[_threeIndex] + _total == arr[arr.length - 1]) {
                            splitIndex[0] = index + 1;
                            splitIndex[1] = _secondIndex;
                            splitIndex[2] = _threeIndex;
                            total = _total;
                            flag = true;
                        }
                    }
                }
            }

            return flag;
        }

        public void print() {
            if (!checkInt) {
                System.out.println("输入含有不合法的非数字字符");
            }
            if (!excute()) {
                System.out.println("不存在这样的分隔符");
            } else {
                System.out.println("存在~");
            }
        }
    }
}