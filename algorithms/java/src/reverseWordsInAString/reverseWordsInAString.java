public class Solution {
    public String reverseWords(String s) {
        StringBuilder reversed = new StringBuilder();
        // Two pointer i and j.
        int j = s.length();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                j = i;
            } else if (i == 0 || s.charAt(i - 1) == ' ') {
                /**This is pig.
                 * Case 1: When the T in
                 * "This" reaches the index 0. We should append
                 * the substring.
                 * Case 2: When the space ' ' before pig is reached,
                 * we should append the substring after the space.
                */
                /**As long as reversed is not empty, then we can add
                 * the space ' ' in front of the word.
                */
                if (reversed.length() != 0) {
                    reversed.append(' ');
                }
                reversed.append(s.substring(i, j));
            }
        }
        return reversed.toString();
    }
}