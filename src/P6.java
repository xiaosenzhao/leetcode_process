/**
 * Created by xiaosen on 2017/7/6.
 */
public class P6 {
    public String convert(String s, int numRows) {
        if(s == null)
            return null;
        int len = s.length();
        if(len == 0 || numRows <= 0)
            return s;
        StringBuilder[] buffers = new StringBuilder[numRows];
        for(int i = 0; i < numRows; i++)
            buffers[i] = new StringBuilder();
        int index = 0;
        while(index < len) {
            for(int i = 0; i < numRows; i++) {
                if(index < len) {
                    buffers[i].append(s.charAt(index));
                    index++;
                }
            }
            for(int j = numRows - 2; j > 0; j--) {
                if(index < len) {
                    buffers[j].append(s.charAt(index));
                    index++;
                }
            }
        }
        for(int i = 1; i < numRows; i++) {
            buffers[0].append(buffers[i]);
        }
        return buffers[0].toString();
    }
    public static void main(String[] args) {
        P6 solve = new P6();
        System.out.println(solve.convert("A", 1));
    }
}
