import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> lastSeen = new HashMap<>();
        int start = 0;
        int longest = 0;

        for (int end = 0; end < s.length(); end++) {
            char current = s.charAt(end);

            if (lastSeen.containsKey(current)) {
                start = Math.max(start, lastSeen.get(current) + 1);
            }

            lastSeen.put(current, end);
            longest = Math.max(longest, end - start + 1);
        }

        return longest;
    }
}