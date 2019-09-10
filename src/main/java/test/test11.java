package test;

import java.util.ArrayList;
import java.util.List;

public class test11 {
    public static void main(String[] args) {
        int num = 1854;
        List<Integer> list = new ArrayList<>();
        while(num/10!=0){
            list.add(num%10);
            num /= 10;
        }
        list.add(num);
        System.out.println(list.toString());
    }
}
