import java.util.Map;
import java.util.HashMap;
import java.io.*;

/**
 * Created by xiaosen on 2017/6/29.
 */
public class P13 {
    public int romanToInt(String s) {
        if (s == null || s.length() == 0)
            return 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int length = s.length();
        if (length < 2) {
            return map.get(s.charAt(length - 1));
        }
        int sum = map.get(s.charAt(length - 1));
        for (int i = length - 2; i >= 0; i--) {
            char pre = s.charAt(i);
            char aft = s.charAt(i + 1);
            if (map.get(pre) < map.get(aft)) {
                sum -= map.get(pre);
            }
            else {
                sum += map.get(pre);
            }
        }
        return sum;
    }
    public static void main(String []args) {
        P13 solution = new P13();
        int deciminal = solution.romanToInt("DCXXI");
        System.out.println(deciminal);
    }
}
