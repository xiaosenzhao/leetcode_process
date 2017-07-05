/**
 * Created by zhaoxiaosen on 2017/7/5.
 */
public class P5 {
    public String extendAround(String s, int left, int right) {
        int n = s.length();
        while(left >= 0 && right <= n - 1 && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
    public String longestPalindrome(String s) {
        if(s == null)
            return null;
        int len = s.length();
        if(len == 0)
            return null;
        String longest = s.substring(0, 1);
        for(int i = 0; i <= len - 1; i++) {
            String tmp = extendAround(s, i, i);
            if(tmp.length() > longest.length())
                longest = tmp;
        }
        for(int i = 0; i < len - 1; i++) {
            String tmp = extendAround(s, i, i + 1);
            if(tmp.length() > longest.length())
                longest = tmp;
        }
        return longest;
    }
    public static void main(String[] args) {
        P5 solve = new P5();
        String s = solve.longestPalindrome("babad");
        System.out.println(s);
    }
}
