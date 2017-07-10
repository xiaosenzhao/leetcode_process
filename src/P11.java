/**
 * Created by zhaoxiaosen on 2017/7/9.
 * 这道题最开始理解错误了，所有费了点劲
 * 这道题其实是找出左右两条线，由这两条线和x轴组成一个桶，找盛最多水的桶
 * 不用管中间的线
 */
public class P11 {
    public int maxArea(int[] height) {
        if(height == null)
            return 0;
        int len = height.length;
        if(len == 1 || len == 0)
            return 0;
        int left = 0;
        int right = len - 1;
        int maxContainer = 0;
        while(left < right) {
            int minHeight = (height[left] > height[right]) ? height[right] : height[left];
            int tmpContainer = minHeight * (right - left);
            maxContainer = (maxContainer > tmpContainer) ? maxContainer : tmpContainer;
            while(height[left] <= minHeight && left < right)
                left++;
            while(height[right] <= minHeight && left < right)
                right--;
        }
        return maxContainer;
    }
    public static void main(String[] args) {
        int[] height = {3,1,2,3};
        P11 solve = new P11();
        System.out.println(solve.maxArea(height));
    }
}
