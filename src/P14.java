/**
 * Created by zhaoxiaosen on 2017/6/29.
 */
public class P14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null) {
            return "";
        }
        if (strs.length == 0) {
            return "";
        }
        else if (strs.length == 1) {
            return strs[0];
        }
        int nums = strs.length;
        String prex = strs[0];
        for(int i = 1; i <= nums - 1; i++) {
            int len1 = prex.length();
            int len2 = strs[i].length();
            int end = (len1 > len2) ? len2 : len1;
            int j = 0;
            while(j < end && strs[i].charAt(j) == prex.charAt(j))
                j++;
            if (j == 0)
                return "";
            prex = prex.substring(0, j);
        }
        return prex;
    }
    public static void main(String[] args){
        P14 solution = new P14();
        String[] strs = {
                "a",
                "b"
        };
        String prex = solution.longestCommonPrefix(strs);
        System.out.println(prex);
    }
}
