/**
 * Created by xiaosen on 2017/6/30.
 */
public class P27 {
    public int removeElement(int[] nums, int val) {
        if (nums == null)
            return 0;
        int length = nums.length;
        if (length == 0) {
            return 0;
        }
        int j = 0;
        for (int i = 0; i < length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        P27 solve = new P27();
        int ret = solve.removeElement(nums, val);
        System.out.println(ret);
    }
}
