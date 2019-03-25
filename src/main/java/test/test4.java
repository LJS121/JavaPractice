package test;
/**
 * Collections所有的数据结构的hashcode和equals都被修改过了
 *
 * subString(int start,int end) || subString(int index)
 * 如果start == end 返回空字符串
 * 如果index > str.length-1 返回空字符串
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class test4 {
    public static void main(String[] args) {
//        String s = "nihao";
//        System.out.println(s.startsWith("n"));
//        String s1= "ninihao";

        String s = "nihao";
        Set<String> set = new HashSet<>();
        set.add("nihao");
        System.out.println(set.add("nihao"));
        String s1 = "nihao";
        System.out.println(set.add(s1));
        ArrayList<String> list = new ArrayList<>();
        list.add(s);
        System.out.println(list.contains(s1));

        String substring = s1.substring(5);
        String substring1 = s1.substring(0, 0);
        System.out.println(substring.length());
        System.out.println(substring1.length());
    }
}
