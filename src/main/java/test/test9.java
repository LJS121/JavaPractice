package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class test9 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set1 = new HashSet<>();
        set.add(1);
        set.add(2);
        set1.add(1);
        set1.add(3);
        System.out.println(set.addAll(set1));
        System.out.println(set.toString());
        List<String> list = new ArrayList<>();
        list.add("8");
        list.add("9");
        list.add("10");
        Collections.sort(list);
        System.out.println(list.toString());
        System.out.println('0'+0);
    }
}
