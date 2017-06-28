/**
 * Created by xiaosen on 2017/6/28.
 */
public class P9 {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x %10 == 0))
            return false;
        if (x >=0 && x <= 9)
            return true;
        int rev = 0;
        while (x > rev) {
            rev = rev * 10 + x % 10;
            x = x / 10;
        }
        return (x == rev || x == rev / 10);
    }
}
