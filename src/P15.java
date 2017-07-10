/**
 * Created by xiaosen on 2017/7/10.
 */

import java.util.List;
import java.util.LinkedList;
import java.util.Arrays;
public class P15 {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null)
            return null;
        int length = nums.length;
        if(length < 3)
            return new LinkedList<>();
        List<List<Integer>> ret = new LinkedList<>();
        Arrays.sort(nums);
        for(int i = 0; i < length - 2; i++) {
            if(i == 0 || nums[i] != nums[i - 1]) {
                int sum = 0 - nums[i];
                int left = i + 1;
                int right = length - 1;
                while (left < right) {
                    if (nums[left] + nums[right] == sum) {
                        ret.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        while (left < right && nums[left] == nums[left + 1])
                            left++;
                        while (left < right && nums[right] == nums[right - 1])
                            right--;
                        left++;
                        right--;
                    } else if (nums[left] + nums[right] > sum) {
                        right--;
                    } else {
                        left++;
                    }
                }
            }
        }
        return ret;
    }
    public static void main(String[] args) {
        P15 solve = new P15();
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(solve.threeSum(nums));
    }
}
