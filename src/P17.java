import java.util.LinkedList;

/**
 * Created by xiaosen on 2017/7/11.
 */
public class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits == null)
            return null;
        int len = digits.length();
        if(len == 0)
            return new LinkedList<String>();
        LinkedList<String> result = new LinkedList<String>();
        result.add("");
        String[] digitsMap = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs","tuv", "wxyz"};
        for(int i = 0; i < len; i++) {
            int num = Character.getNumericValue(digits.charAt(i));
            String numCharacters = digitsMap[num];
            while(result.peek() != null && result.peek().length() == i) {
                String tmp = result.remove();
                for(char j : numCharacters.toCharArray()) {
                    result.add(tmp + j);
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Solution solve = new Solution();
        String digits = "23";
        System.out.println(solve.letterCombinations(digits));
    }
}
