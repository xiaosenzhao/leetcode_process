import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by xiaosen on 2017/6/28.
 */
public class P7 {
    public int reverse(int x) {
        if (x == 0)
            return 0;
        int result = 0;
        int flag = 1;
        if (x < 0){
            x = x * (-1);
            flag = -1;
        }
        while(x > 0) {
            int tail = x % 10;
            int newresult = result * 10 + tail;
            if ((newresult - tail) / 10 != result) {
                return 0;
            }
            result = newresult;
            x = x / 10;
        }
        return result * flag;
    }
}