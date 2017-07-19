/**
 * Created by xiaosen on 2017/7/19.
 */
public class P33 {
    public int search(int[] nums, int target) {
        if(nums == null)
            return -1;
        int len = nums.length;
        int low = 0;
        int high = len - 1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(nums[mid] == target)
                return mid;
            if(nums[mid] >= nums[low]) {
                if(target >= nums[low] && target < nums[mid]) {
                    high = mid - 1;
                }
                else
                    low = mid + 1;
            }
            else {
                if(target > nums[mid] && target <= nums[high]) {
                    low = mid + 1;
                }
                else
                    high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        P33 solve = new P33();
        int[] nums = {4,5,6,1,2,3};
        System.out.println(solve.search(nums,5));
    }
}
