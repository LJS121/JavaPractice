package test;

import org.apache.commons.lang.ArrayUtils;

import java.util.Arrays;
import java.util.List;

/**
 * asList 只认基本数据类型 数组会被当成对象类型  需要使用ArraysUtils的toObject转换一下 返回成Integer[]
 */

public class test {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        List ints = Arrays.asList( ArrayUtils.toObject(a));
        System.out.println(ints);
        System.out.println(ints.toString());

        String[] str = {"1","2","3","4"};
        List<String> strings = Arrays.asList(str);
        System.out.println(strings);

        Integer[] i = {1,2,3,4};
        List<Integer> integers = Arrays.asList(i);
        System.out.println(integers);
    }
}
