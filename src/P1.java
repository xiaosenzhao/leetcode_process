import java.util.HashMap;
import java.util.Map;

/**
 * Created by xiaosen on 2017/6/27.
 */
public class P1 {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int[] ret = towSum(nums,9);
        System.out.println(ret[0] + " " + ret[1]);
    }
    public static int[] towSum(int[] nums, int target) {
        int[] ret = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            int tmp = target - nums[i];
            if (map.containsKey(tmp)) {
                ret[0] = map.get(tmp);
                ret[1] = i;
                return ret;
            }
            map.put(nums[i], i);
        }
        return ret;
    }
}
