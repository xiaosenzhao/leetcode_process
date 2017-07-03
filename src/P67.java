/**
 * Created by xiaosen on 2017/7/3.
 */
public class P67 {
    public String addBinary(String a, String b) {
        if(a == null || b == null)
            return null;
        int len1 = a.length();
        int len2 = b.length();
        int i = len1 - 1;
        int j = len2 - 1;
        int carry = 0;
        StringBuilder newStr = new StringBuilder();
        while(i >= 0 || j >=0) {
            int sum = carry;
            if(i >= 0)
                sum += a.charAt(i--) - '0';
            if(j >= 0)
                sum += b.charAt(j--) - '0';

            if(sum >= 2) {
                newStr.append(sum - 2);
                carry = 1;
            }
            else {
                newStr.append(sum);
                carry = 0;
            }
        }
        if(carry != 0)
            newStr.append(carry);
        return newStr.reverse().toString();
    }
    public static void main(String[] args) {
        P67 solve = new P67();
        String a = "11111";
        String b = "1";
        String ret = solve.addBinary(a, b);
        System.out.println(ret);
    }
}
