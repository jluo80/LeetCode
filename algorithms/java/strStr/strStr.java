public class Solution {
    public int strStr(String haystack, String needle) {
        // Brute force method
        // Specific scenarios
        if (haystack.length() == 0 && needle.length() == 0) return 0;
        if (needle.length() == 0) return 0;
        if (haystack.length() == 0) return -1;
        if (needle.length() > haystack.length()) return -1;

        for (int i = 0; i < haystack.length(); i ++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (haystack.length() - i >= needle.length() && haystack.substring(i, i + needle.length()).equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }
}