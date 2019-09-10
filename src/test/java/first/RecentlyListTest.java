package first;

import org.junit.Test;

import static org.junit.Assert.*;

public class RecentlyListTest {

    @Test
    public void add() {

    }

    @Test
    public void find() throws Exception {
        //given
        RecentlyList rl = new RecentlyList(5);
        rl.add("XX");
        rl.add("YY");
        rl.add("ZZ");
        rl.add("AA");
        rl.add("");
        for (int i = 0; i < rl.size(); i++) {
            System.out.print(rl.find(i));
        }

    }
    @Test
    public void size() throws Exception {
        RecentlyList rl = new RecentlyList(3);
        rl.add("mm");
        rl.add("nn");
        rl.add("dd");
        rl.add("gg");

        assertEquals(rl.size(),3);
    }
}