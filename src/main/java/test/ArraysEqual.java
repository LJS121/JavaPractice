package test;
/**
 * new 出来的String 地址肯定不一样
 * 但是字符串常量池是否增加 要先判断字符串常量池里有没有这个String
 */

import java.util.Arrays;

/**
 * @author jinsong.Liang
 * @Description
 * @date 2019/4/3 11:41
 */
public class ArraysEqual {
    public static void main(String[] args) {
        String[] s1 = new String[4];
        Arrays.fill(s1,"hi");
        String[] s2= new String[]{"hi","hi","hi","hi"};
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(Arrays.equals(s1,s2));

        String s11 = "h"+"i";
        String s12 = "hi";
        System.out.println(s11==s12);
    }
}
