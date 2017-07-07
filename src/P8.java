/**
 * Created by xiaosen on 2017/7/7.
 */
public class P8 {
    public int myAtoi(String str) {
        if(str == null)
            return 0;
        int len = str.length();
        if(len == 0)
            return 0;
        int index = 0;
        while(str.charAt(index) == ' ')
            index++;
        int flag = 1;
        if(str.charAt(index) == '+') {
            flag = 1;
            index++;
        }
        else if(str.charAt(index) == '-') {
            flag = -1;
            index++;
        }
        int ret = 0;
        for(;index < len; index ++) {
            int digit = str.charAt(index) - '0';
            if (digit >= 0 && digit <= 9) {
                if (Integer.MAX_VALUE / 10 < ret || (Integer.MAX_VALUE / 10 == ret && Integer.MAX_VALUE % 10 < digit)) {
                    if (flag == 1)
                        return Integer.MAX_VALUE;
                    else
                        return Integer.MIN_VALUE;
                }
                ret = ret * 10 + digit;
            }
            else
                break;
        }
        return flag * ret;
    }
}
