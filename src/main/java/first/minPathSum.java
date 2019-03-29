package first;

/**
 * 求二维数组中一点到另一点的 最短路径 每个坐标点都有一个数据
 */
public class minPathSum {
    public static void main(String[] args) {
        minPathSum mp = new minPathSum();
        int[][] ints = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        System.out.println(mp.minSum(ints));
    }

    public int minSum(int[][] grid) {
        if (grid == null) {
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = grid[0][0];
        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }
        for (int j = 1; j < n; j++) {
            dp[0][j] = dp[0][j - 1] + grid[0][j];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }
        return dp[m - 1][n - 1];
    }
}
