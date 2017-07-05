/**
 * Created by xiaosen on 2017/7/4.
 */
public class P88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums2 == null || n == 0)
            return;
        int i = m - 1;
        int j = n - 1;
        int k = m + n -1;
        while(i >= 0 && j >= 0){
            if(nums1[i] >= nums2[j])
                nums1[k--] = nums1[i--];
            else
                nums1[k--] = nums2[j--];
        }
        while(j >= 0)
            nums1[k--] = nums2[j--];
    }
}
