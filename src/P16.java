import java.util.Arrays;
import java.util.Map;

/**
 * Created by xiaosen on 2017/7/10.
 */
public class P16 {
    public int threeSumClosest(int[] nums, int target) {
        if(nums == null)
            throw new IllegalArgumentException();
        int lenght = nums.length;
        if(lenght < 3)
            throw new IllegalArgumentException();
        Arrays.sort(nums);
        int closest = 0;
        boolean flag = false;
        for(int i = 0; i < lenght - 2; i++) {
            if(i == 0 || nums[i] != nums[i - 1]) {
                int left = i + 1;
                int right = lenght - 1;
                while(left < right) {
                    int tmp = nums[i] + nums[left] + nums[right];
                    if(tmp == target)
                        return tmp;
                    else if(tmp > target)
                        right--;
                    else
                        left++;
                    if(!flag) {
                        closest = tmp;
                        flag = true;
                    }
                    else {
                        int diff1 = Math.abs(closest - target);
                        int diff2 = Math.abs(tmp - target);
                        closest = (diff1 > diff2) ? tmp : closest;
                    }
                }
            }
        }
        return closest;
    }
    public static void main(String[] args) {
        int[] num = {0,2,1,-3};
        int target = 1;
        P16 solve = new P16();
        System.out.println(solve.threeSumClosest(num, target));
    }
}
