/**
 * Created by xiaosen on 2017/7/3.
 */
public class P66 {
    public int[] plusOne(int[] digits) {
        if(digits == null) {
            return null;
        }
        int length = digits.length;
        if(length == 0)
            return null;
        int carry = 1;
        for(int i = length - 1; i >= 0; i--) {
            int sum = digits[i] + 1;
            if(sum >= 10) {
                digits[i] = sum - 10;
                carry = 1;
            }
            else {
                digits[i] = sum;
                carry = 0;
                break;
            }
        }
        if(carry == 1) {
            int[] newDigits = new int[length + 1];
            for(int i = 0; i < length; i++)
                newDigits[i + 1] = digits[i];
            newDigits[0] = 1;
            return newDigits;
        }
        return digits;
    }
    public static void main(String[] args) {
        int[] digits = {9,9,9,9,9,9,9};
        P66 solve = new P66();
        int[] newdigits = solve.plusOne(digits);
        for(int i = 0; i < newdigits.length; i++) {
            System.out.print(newdigits[i]);
        }
    }
}
