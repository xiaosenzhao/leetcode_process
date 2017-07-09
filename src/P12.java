/**
 * Created by zhaoxiaosen on 2017/7/9.
 */
public class P12 {
    public String intToRoman(int num) {
        if(num < 1 && num > 3999)
            return null;
        String M[] = {"", "M", "MM", "MMM"};
        String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        StringBuilder sb = new StringBuilder();
        sb.append(M[num / 1000]);
        sb.append(C[(num % 1000) / 100]);
        sb.append(X[(num % 100) / 10]);
        sb.append(I[num % 10]);
        return sb.toString();
    }
    public static void main(String[] args) {
        int num = 1002;
        P12 solve = new P12();
        System.out.println(solve.intToRoman(num));
    }
}
