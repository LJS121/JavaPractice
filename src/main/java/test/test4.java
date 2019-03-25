package test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class test4 {
    public static void main(String[] args) {
        System.out.println("my first download from Github.com");
        HashSet<String> set = new HashSet<>();
        HashMap map = new HashMap<>();
        String s1 = "niaho";
        String s2 = "nihao";
        System.out.println(s1==s2);
        System.out.println(s1.hashCode()==s2.hashCode());
        map.put("nihao",10);
        set.add(s1);
        set.add(s2);
        for (String s:set
             ) {
            System.out.println(s);
        }
    }
}
