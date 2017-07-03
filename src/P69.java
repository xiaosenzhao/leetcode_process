/**
 * Created by xiaosen on 2017/7/3.
 * notice out of bounds
 */
public class P69 {
    public int mySqrt(int x) {
        if(x < 0)
            return 0;
        if(x <= 1)
            return x;
        int min = 1;
        int max = x / 2;
        while(min <= max) {
            int mid = (min + max) / 2;
            if(x / mid == mid)
                return mid;
            else if(x / mid > mid)
                min = mid + 1;
            else
                max = mid - 1;
        }
        return max;
    }
    public static void main(String[] args) {
        P69 solve = new P69();
        int ret = solve.mySqrt(9);
        System.out.println(ret);
        ret = solve.mySqrt(1);
        System.out.println(ret);
        ret = solve.mySqrt(16);
        System.out.println(ret);
        ret = solve.mySqrt(2147395599);
        System.out.println(ret);
    }
}
