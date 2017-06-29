import java.util.Map;
/**
 * Created by xiaosen on 2017/6/28.
 */
public class P3 {
        public int lengthOfLongestSubstring(String s) {
            if (s == null || s.length() == 0)
                return 0;
            int max = 0;
            Map<Character, Integer> map = new HashMap<Character, Integer>();
            for(int i = 0, j = 0; i < s.length(); i ++) {
                if (map.containsKey(s.charAt(i))) {
                    j = Math.max(map.get(s.charAt(i)) + 1, j);
                }
                max = Math.max(max, i - j + 1);
                map.put(s.charAt(i), i);
            }
            return max;
        }
}
