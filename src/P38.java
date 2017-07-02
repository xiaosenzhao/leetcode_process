/**
 * Created by xiaosen on 2017/7/2.
 */
public class P38 {
    public String countAndSay(int n) {
        if(n == 0)
            return null;
        if(n == 1)
            return "1";
        String str = countAndSay(n - 1);
        int count = 1;
        char tmp = str.charAt(0);
        StringBuffer strbuf = new StringBuffer("");
        for(int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == tmp) {
                count++;
            }
            else {
                strbuf.append("" + count + tmp);
                tmp = str.charAt(i);
                count = 1;
            }
        }
        strbuf.append("" + count + tmp);
        return strbuf.toString();
    }
    public static void main(String[] args) {
        int n = 3;
        P38 solve = new P38();
        String ret = solve.countAndSay(n);
        System.out.println(ret);
    }
}
