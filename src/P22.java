import java.util.LinkedList;
import java.util.List;
/**
 * Created by zhaoxiaosen on 2017/7/13.
 */
public class P22 {
    public List<String> generateParenthesis(int n) {
        if(n <= 0)
            return null;
        LinkedList<String> result = new LinkedList<String>();
        generate(result, "", 0, 0, n);
        return result;
    }
    public void generate(List<String> list, String s, int open, int close, int n) {
        if(open == n && close == n) {
            list.add(s);
            return;
        }
        if(open < n)
            generate(list, s + "(", open + 1, close, n);
        if(close < open)
            generate(list, s + ")", open, close + 1, n);
    }
    public static void main(String[] args) {
        P22 solve = new P22();
        System.out.println(solve.generateParenthesis(10));
    }
}
