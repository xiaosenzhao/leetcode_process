import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;
/**
 * Created by xiaosen on 2017/7/12.
 */
public class P18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if(nums == null)
            return null;
        int len = nums.length;
        if(len < 4)
            return new LinkedList<>();
        Arrays.sort(nums);
        LinkedList<List<Integer>> result = new LinkedList<List<Integer>>();
        for(int i = 0; i < len - 3; i++) {
            if(i == 0 || nums[i] != nums[i - 1]) {
                for(int j = i + 1; j< len - 2; j++) {
                    if(j > i + 1 && nums[j] == nums[j - 1])
                        continue;
                    int left = j + 1;
                    int right = len - 1;
                    while (left < right) {
                        int sum = target - nums[i] - nums[j];
                        if (nums[left] + nums[right] == sum) {
                            List<Integer> tmp = Arrays.asList(nums[i], nums[j], nums[left], nums[right]);
                            result.add(tmp);
                            while(left < right && nums[left + 1] == nums[left])
                                left++;
                            while(left < right && nums[right - 1] == nums[right])
                                right--;
                            left++;
                            right--;
                        } else if (nums[left] + nums[right] < sum) {
                            left++;
                        } else {
                            right--;
                        }
                    }
                }
            }
        }
        return result;
    }
}
