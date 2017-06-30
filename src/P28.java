/**
 * Created by xiaosen on 2017/6/30.
 */
public class P28 {
    public void getNext(String needle, int[] next) {
        int len = needle.length();
        next[0] = -1;
        int k = -1;
        int j = 0;
        while(j < len - 1) {
            if(k == -1 || needle.charAt(k) == needle.charAt(j)) {
                k++;
                j++;
                next[j] = k;
            }
            else {
                k = next[k];
            }
        }
    }
    public int strStr(String haystack, String needle) {
        if(haystack == null || needle == null)
            return -1;
        if(needle.length() == 0)
            return 0;
        if(haystack.length() == 0 && needle.length() != 0)
            return -1;
        int i = 0;
        int j = 0;
        int hlen = haystack.length();
        int nlen = needle.length();
        int[] next = new int[nlen];
        getNext(needle, next);
        while(i < hlen && j < nlen) {
            if (j == -1 || haystack.charAt(i) == needle.charAt(j)){
                i++;
                j++;
            }
            else {
                j = next[j];
            }
        }
        if (j == nlen)
            return i - j;
        else
            return -1;
    }
    public static void main(String[] args) {
        P28 solve = new P28();
        String haystack = "dffdsakfjdksj";
        String needle = "dsak";
        int ret = solve.strStr(haystack, needle);
        System.out.println(ret);
    }
}
