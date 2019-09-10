package first;

import java.util.HashMap;

public class RomanNumber {
    public static void main(String[] args) {
        RomanNumber rm = new RomanNumber();
        System.out.println(rm.transfer(1890));
    }

    public String transfer(int num) {
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, String> map1 = new HashMap<>();
        HashMap<Integer, String> map2 = new HashMap<>();
        HashMap<Integer, String> map3 = new HashMap<>();
        HashMap<Integer, String> map4 = new HashMap<>();
        map1.put(1, "M");
        map1.put(2, "MM");
        map1.put(3, "MMM");
        map1.put(4, "MMMM");

        map2.put(1, "C");
        map2.put(2, "CC");
        map2.put(3, "CCC");
        map2.put(4, "CD");
        map2.put(5, "D");
        map2.put(6, "DC");
        map2.put(7, "DCC");
        map2.put(8, "DCCC");
        map2.put(9, "CM");

        map3.put(1, "X");
        map3.put(2, "XX");
        map3.put(3, "XXX");
        map3.put(4, "XL");
        map3.put(5, "L");
        map3.put(6, "LX");
        map3.put(7, "LXX");
        map3.put(8, "LXXX");
        map3.put(9, "XC");

        map4.put(1, "I");
        map4.put(2, "II");
        map4.put(3, "III");
        map4.put(4, "IV");
        map4.put(5, "V");
        map4.put(6, "VI");
        map4.put(7, "VII");
        map4.put(8, "VIII");
        map4.put(9, "IX");

        int k, b, s, g;
        k = num / 1000;
        b = (num - k * 1000) / 100;
        s = (num / 10) % 10;
        g = num % 10;

        if (map1.containsKey(k)) {
            sb.append(map1.get(k));
        }
        if (map2.containsKey(b)) {
            sb.append(map2.get(b));
        }
        if (map3.containsKey(s)) {
            sb.append(map3.get(s));
        }
        if (map4.containsKey(g)) {
            sb.append(map4.get(g));
        }

        return sb.toString();
    }
}
