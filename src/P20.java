import java.util.LinkedList;

/**
 * Created by xiaosen on 2017/6/30.
 */
public class P20 {
    public boolean isValid(String s) {
        if (s == null) {
            return false;
        }
        if (s.length() <= 1) {
            return false;
        }
        LinkedList<Character> stack = new LinkedList<Character>();
        int i = 0;
        while(i < s.length()) {
            if(s.charAt(i) == '(')
                stack.addFirst(')');
            else if(s.charAt(i) == '{')
                stack.addFirst('}');
            else if(s.charAt(i) == '[')
                stack.addFirst(']');
            else {
                if(stack.isEmpty()){
                    return false;
                }
                char pre = stack.pollFirst();
                if(s.charAt(i) != pre)
                    return false;
            }
            i++;
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        P20 solve = new P20();
        boolean ret = solve.isValid("(())");
        System.out.println(ret);
        ret = solve.isValid("(((((");
        System.out.println(ret);
        ret = solve.isValid("(");
        System.out.println(ret);
        ret = solve.isValid("");
        System.out.println(ret);
        ret = solve.isValid("(([]{}){})");
        System.out.println(ret);
    }
}
