package first;

import org.junit.Test;

import java.util.Random;

public class MontyHall {
    public void MontyHallSolution() {
        int[] num = {1, 2, 3};
        int count1 = 0, count2 = 0;
        int loop = 1000000;
        while (loop-- > 0) {
            shuffle(num);
            if (num[1] == 1 || num[1] == 2 && num[2] == 1 || num[2] == 2) {//后两者有一只羊
                count1++;
            } else {
                count2++;
            }
        }
        System.out.println("换掉的概率:" + (float) count1 / (count1 + count2));
        System.out.println("不换的概率:" + (float) count2 / (count1 + count2));
    }

    public void shuffle(int[] arr) {
        Random rd = new Random();
        for (int i = arr.length - 1; i >= 0; i--) {
            int index = rd.nextInt(i + 1);
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }

    @Test
    public void MontyHallSolutionTest() {
        MontyHallSolution();
    }
}
