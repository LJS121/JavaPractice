package first;

import org.junit.Test;

public class SaddlePoints {

    public void getSaddlePoints(int[][] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (rowMax(arr, i, j) && columnMin(arr, i, j)) {
                    count++;
                    System.out.println("saddle points" + count + " 坐标:" + "(" + i + "," + j + ")");
                } else {
                    continue;
                }
            }
        }
        if (count == 0) {
            System.out.println("no saddlePoints");
        }
    }

    private boolean rowMax(int[][] arr, int i, int j) {
        for (int k : arr[i]
        ) {
            if (k > arr[i][j]) {
                return false;
            }
        }
        return true;
    }

    private boolean columnMin(int[][] arr, int i, int j) {
        for (int k = 0; k < arr.length; k++) {
            if (arr[k][j] < arr[i][j]) {
                return false;
            }
        }
        return true;
    }

    @Test
    public void getSaddlePointsTest() {
        int[][] arr = {{1, 2, 3, 4, 5}, {7, 2, 8, 9, 6}, {4, 2, 3, 5, 5}, {1, 3, 4, 5, 8}, {1, 6, 7, 5, 9}};
        getSaddlePoints(arr);
    }
}
