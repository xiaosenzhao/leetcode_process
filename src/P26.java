/**
 * Created by xiaosen on 2017/6/30.
 */
public class P26 {
    public int removeDuplicates(int[] nums) {
        if(nums == null)
            return 0;
        int length = nums.length;
        if(length <= 1)
            return length;
        int j = 1;
        int i = 1;
        while(i < length) {
            if(nums[i] != nums[i - 1]){
                nums[j++] = nums[i];
            }
            i++;
        }
        return j;
    }
    public static void main(String[] args) {
        P26 solve = new P26();
        int[] nums = {1,1};
        int ret = solve.removeDuplicates(nums);
        System.out.println(ret);
    }
}
