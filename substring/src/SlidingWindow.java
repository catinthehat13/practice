import java.util.HashSet;
import java.util.Set;

/**
 * Created by Anne on 12/4/2017.
 */
public class SlidingWindow {

    public int lengthOfLongestSubstring(String s) {
        int result = 0, start = 0, end = 0;

        Set<Character> vc = new HashSet<Character>();
        int curLen = 0;

        while(end < s.length()) {

            if(!vc.contains(s.charAt(end))) {
                vc.add(s.charAt(end));
                end++;
                curLen++;
            }
            else {
                vc.remove(s.charAt(start));
                start++;

                if (result < curLen) {
                    result = curLen;
                }
                curLen--;
            }
        }

        if (result < curLen) {
            result = curLen;
        }

        return result;
    }
 }
