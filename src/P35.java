/**
 * Created by xiaosen on 2017/7/2.
 */
public class P35 {
    public int searchInsert(int[] nums, int target) {
        if(nums == null)
            return 0;
        if(nums.length == 0)
            return 0;
        int min = 0;
        int max = nums.length - 1;
        while(min <= max) {
            int mid = (min + max) / 2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < target)
                min = mid + 1;
            else
                max = mid - 1;
        }
        return min;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;
        P35 solve = new P35();
        int ret = solve.searchInsert(nums, target);
        System.out.println(ret);
    }
}
