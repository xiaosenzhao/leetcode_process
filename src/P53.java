/**
 * Created by xiaosen on 2017/7/2.
 */
public class P53 {
   public int maxSubArray(int[] nums) {
       if(nums == null)
           return 0;
       int length = nums.length;
       if(length == 0)
           return 0;
       int sum = nums[0];
       int maxsum = nums[0];
       for(int i = 1; i < length; i++) {
           if(sum < 0) {
               sum = nums[i];
           }
           else {
               sum = sum + nums[i];
           }
           maxsum = Math.max(sum, maxsum);
       }
       return maxsum;
   }
   public static void main(String[] args) {
       P53 solve = new P53();
       int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
       int ret = solve.maxSubArray(nums);
       System.out.println(ret);
   }
}
