import redo.Anagrams2;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Anagram2Test {


    @Test
    public void one_Char() {
        //given

        //when
        List<String> list = Anagrams2.of("b");

        //then
        Assert.assertTrue(list.size() == 1);
    }

    @Test
    public void two_Char() {
        //given

        //when
        List<String> list = Anagrams2.of("bi");

        //then
        Assert.assertTrue(list.size() == 2);
        Assert.assertEquals("bi", list.get(0));
    }

    @Test
    public void three_Char() {
        //given
        List<String> listGiven = Arrays.asList("bir", "bri", "ibr", "irb", "rbi", "rib");

        //when
        List<String> list = Anagrams2.of("bir");

        //then
        Assert.assertTrue(list.size() == 6);
        Assert.assertTrue(listGiven.containsAll(list));
    }

    @Test
    public void four_Char() {
        //given
        int count1=0,count2=0,count3=0,count4=0;
        //when
        List<String> list = Anagrams2.of("biri");
        //then

//        for (String s:list
//             ) {
//            if(s.startsWith("b")){
//                count1++;
//                System.out.print(s+"    ");
//            }
//        }
//        System.out.println();
//        for (String s:list
//        ) {
//            if(s.startsWith("i")){
//                count2++;
//                System.out.print(s+"    ");
//            }
//        }
//        System.out.println();
//        for (String s:list
//        ) {
//            if(s.startsWith("r")){
//                count3++;
//                System.out.print(s+"    ");
//            }
//        }
        System.out.println(list.size());
//        for (String s:list
//        ) {
//            if(s.startsWith("o")){
//                count4++;
//                System.out.print(s+"    ");
//            }
//        }
//        System.out.println(JSON.toJSONString(list));


    }

}
