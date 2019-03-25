package test;

import java.util.ArrayList;
import java.util.Collections;

public class test6 {
    public static void main(String[] args) {
        Character c1 = 'a';
        Character c2 = 'a';
        Character c3 = 'c';
        Character c4 = 'c';
        ArrayList a1 = new ArrayList();
        a1.add(c1);
        a1.add(c3);
        ArrayList a2 = new ArrayList();
        a2.add(c2);
        a2.add(c4);
        Collections.sort(a1);
        Collections.sort(a2);
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a1.toString().equals(a2.toString()));
    }
}
