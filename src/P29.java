import java.security.InvalidParameterException;

/**
 * Created by zhaoxiaosen on 2017/7/16.
 */
public class P29 {
    public int divide(int dividend, int divisor) {
        if(divisor == 0 || (dividend == Integer.MIN_VALUE && divisor == -1))
            return Integer.MAX_VALUE;
        int result = 0;
        int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;
        long dend = Math.abs((long)dividend);
        long dsor = Math.abs((long)divisor);
        while(dend >= dsor) {
            long tmp = dsor;
            int multi = 1;
            while((tmp << 1) < dend) {
                tmp = tmp << 1;
                multi = multi << 1;
            }
            dend -= tmp;
            result += multi;
        }
        return sign == 1 ? result : -result;
    }
    public static void main(String[] args) {
        P29 solve = new P29();
        System.out.println(solve.divide(2147483647,1));
    }
}
