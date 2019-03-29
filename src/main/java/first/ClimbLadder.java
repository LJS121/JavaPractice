package first;

/**
 * 爬20层的楼梯有多少种方法
 */
public class ClimbLadder {
    public static void main(String[] args) {
        ClimbLadder cl = new ClimbLadder();
        System.out.println(cl.climb(20));
    }

    public int climb(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        } else {
            return climb(n - 1) + climb(n - 2);
        }
    }
}
