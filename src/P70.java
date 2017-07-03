/**
 * Created by xiaosen on 2017/7/3.
 */
public class P70 {
    public int climbStairs(int n) {
        if(n <= 2)
            return n;
        int minusOne = 2;
        int minusTwo = 1;
        int result = 0;
        for(int i = 3; i <= n; i++){
            result = minusOne + minusTwo;
            minusTwo = minusOne;
            minusOne = result;
        }
        return result;
    }
    public static void main(String[] args) {
        P70 relove = new P70();
        System.out.println(relove.climbStairs(1));
        System.out.println(relove.climbStairs(2));
        System.out.println(relove.climbStairs(3));
        System.out.println(relove.climbStairs(10));
        System.out.println(relove.climbStairs(4));
    }
}
