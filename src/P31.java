/**
 * Created by zhaoxiaosen on 2017/7/17.
 */
public class P31 {
    public void nextPermutation(int[] nums) {
        if(nums == null)
            return;
        int length = nums.length;
        if(length <= 1)
            return;
        int i = length - 2;
        while(i >= 0 && nums[i] >= nums[i + 1])
            i--;
        if(i >= 0) {
            int j = length - 1;
            while (i >= 0 && j >= 0 && nums[j] <= nums[i])
                j--;
            swap(nums, i, j);
        }
        int l = length - 1;
        int m = i + 1;
        while(l > m) {
            swap(nums, l, m);
            l--;
            m++;
        }
    }
    public void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,1};
        P31 solve = new P31();
        solve.nextPermutation(nums);
        for(int num : nums)
            System.out.println(num);
    }
}
