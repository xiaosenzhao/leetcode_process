/**
 * Created by zhaoxiaosen on 2017/7/19.
 */
public class P34 {
    public int[] searchRange(int[] nums, int target) {
        if(nums == null)
            return null;
        int len = nums.length;
        if(len <= 0)
            return new int[]{-1, -1};
        int low = 0;
        int high = len - 1;
        int position = 0;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(nums[mid] == target) {
                position = mid;
                break;
            }
            else if(nums[mid] < target) {
                low = mid + 1;
            }
            else {
                high = high - 1;
            }
        }
        if(low > high) {
            return new int[]{-1, -1};
        }
        else {
            int i = position;
            while(i >= 0 && nums[i] == nums[position])
                i--;
            int j = position;
            while(j <= len - 1 && nums[j] == nums[position])
                j++;
            int[] re = {i + 1, j - 1};
            return re;
        }
    }
    public static void main(String[] args) {
        P34 solve = new P34();
        int[] nums = {1,2,3,3,4,4,4,5,6,7};
        int[] re = solve.searchRange(nums, 4);
        for(int i : re) {
            System.out.println(i);
        }
    }
}
