package test;


import java.util.ArrayList;
import java.util.List;

public class test8 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("nihao");
        list.add("women");
        list.add("haopengyou");
        list.remove("women");
        for (String s:list
             ) {
            System.out.print(s+" ");
        }
    }
}
