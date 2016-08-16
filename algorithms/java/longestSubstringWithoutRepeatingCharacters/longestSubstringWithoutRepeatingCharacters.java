import java.util.Arrays;
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] charMap = new int[256];
        Arrays.fill(charMap, -1);
        int i = 0;
        int maxLen = 0;
        for (int j = 0; j < s.length(); j++) {
            if (charMap[s.charAt(j)] >= i) {
                /**
                * When the duplicated character appears,
                * the i will be the index of the character which is next of the duplicated one.
                */
                i = charMap[s.charAt(j)] + 1;
            }
            charMap[s.charAt(j)] = j;
            maxLen = Math.max(maxLen, j - i + 1);
        }
        return maxLen;
    }
}