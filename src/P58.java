/**
 * Created by xiaosen on 2017/7/3.
 */
public class P58 {
    public int lengthOfLastWord(String s) {
        if(s == null)
            return 0;
        int length = s.length();
        if(length == 0)
            return 0;
        int max = 0;
        for(int i = length - 1; i >= 0; i--) {
            if(s.charAt(i) == ' ' && max == 0)
                continue;
            else if(s.charAt(i) == ' ' && max != 0)
                return max;
            else
                max++;
        }
        return max;
    }
    public static void main(String[] args) {
        String s = "Hello World";
        P58 solve = new P58();
        int len = solve.lengthOfLastWord(s);
        System.out.println(len);
    }
}
