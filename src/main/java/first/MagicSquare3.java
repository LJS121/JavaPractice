package first;
/**
 * 应该再写个 范围 当超过这个范围视为 没有
 */

import org.junit.Test;

import java.util.Random;

/**
 * 判断是否是神奇矩阵的方法
 *
 * @author jinsong.Liang
 * @date 2019/3/29 17:39
 */


public class MagicSquare3 {
    public void magicSquareSolution(double[][] doubles) {
        while (!judgeMagicSquare(doubles)) {
            upset(doubles);
        }
    }

    private void upset(double[][] doubles) {
        double[] doubles1 = new double[doubles.length * doubles[0].length];
        int index = 0;
        for (double[] temp : doubles
        ) {
            for (double temp1 : temp
            ) {
                doubles1[index++] = temp1;
            }
        }
        for (int i = doubles1.length - 1; i >= 0; i--) {
            Random random = new Random();
            int index2 = random.nextInt(i + 1);
            double temp = doubles1[index2];
            doubles1[index2] = doubles1[i];
            doubles1[i] = temp;
        }

        index = 0;
        for (int i = 0; i < doubles.length; i++) {
            for (int j = 0; j < doubles[0].length; j++) {
                doubles[i][j] = doubles1[index++];
            }
        }
    }

    public boolean judgeMagicSquare(double[][] squares) {
        int len = squares.length;
        double target = getTarget(squares);
        double cross1 = 0, cross2 = 0;
        for (int i = 0; i < len; i++) {
            double rowSum = 0, colNum = 0;
            for (int j = 0; j < len; j++) {
                rowSum += squares[i][j];
                colNum += squares[j][i];
            }
            if (rowSum != target || colNum != target) {
                return false;
            }
            cross1 += squares[i][i];
            cross2 += squares[len - i - 1][i];
        }
        return cross1 == target && cross2 == target;
    }

    /**
     * 获得这个神奇矩阵 横排 竖排 斜排 分别求和应该等于的值
     *
     * @param
     * @return
     */
    private double getTarget(double[][] squares) {
        double sum = 0;
        for (double[] nums : squares
        ) {
            for (double num : nums
            ) {
                sum += num;
            }
        }
        sum /= squares.length;
        return sum;
    }


    @Test
    public void test() {
        double[][] doubles = {{1, 1.5, 2}, {2.5, 3, 3.5}, {4, 4.5, 5}};
        magicSquareSolution(doubles);
        for (double[] temp : doubles
        ) {
            for (double dd : temp
            ) {
                System.out.print(dd + " ");
            }
            System.out.println();
        }
    }
}
