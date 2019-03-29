package first;

import org.apache.commons.lang.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortList {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7};
        int[] b = {2, 4, 6, 8};
        SortList sl = new SortList();
        sl.swap(a, b);
    }

    public void swap(int[] a, int[] b) {
        List ints = Arrays.asList(ArrayUtils.toObject(a));
        List ints1 = Arrays.asList(ArrayUtils.toObject(b));
        List<Integer> list = new ArrayList<>();
        list.addAll(ints);
        list.addAll(ints1);
        Collections.sort(list);
        ints = new ArrayList();
        ints1 = new ArrayList();
        for (int i = 0; i < list.size(); i = i + 2) {
            if (sum(ints) >= sum(ints1)) {//如果你大我就让你先加 因为按顺序排的 先加的小
                ints.add(list.get(i));
                ints1.add(list.get(i + 1));
            } else {    //如果你小 我就让你后加 因为后加的大
                ints1.add(list.get(i));
                ints.add(list.get(i + 1));
            }
        }
        System.out.println("数组a：");
        print(ints);
        System.out.println("数组b：");
        print(ints1);
        System.out.println("两者差:" + Math.abs((sum(ints) - sum(ints1))));
    }

    public int sum(List<Integer> list) {
        int sum = 0;
        for (int i : list
        ) {
            sum += i;
        }
        return sum;
    }

    public void print(List list) {
        System.out.println(list.toString());
    }
}
