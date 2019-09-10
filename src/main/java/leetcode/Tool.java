package leetcode;

/**
 * @author jinsong.Liang
 * @Description
 * @date 2019/9/9 19:00
 */
public class Tool {
    public static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void printInt(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static String numsToString(int[] nums) {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (int num : nums) {
            sb.append(num + ",");
        }
        sb.delete(sb.lastIndexOf(","),sb.length());
        sb.append("}");
        return sb.toString();
    }
}
