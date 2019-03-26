package test;


import java.util.ArrayList;
import java.util.List;

public class test7 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        System.out.println(list.toString());

        String s = "nihao\nwomenshi\nhaopengyou duima?";
        System.out.println(s);

        String s1 = "nih";
//        System.out.println(s1.charAt(3));
        System.out.println(s1.substring(3)==null);
    }
}
