public class Solution {
    public String reverseWords(String s) {
        /**trim() is used to trim the trailing or leading spaces.
         * split() is used to split the string by "regx".
         * In this case, \s indicates A whitespace character, short for [ \t\n\x0b\r\f],
         * \s+ indicates one or more times.
        */
        /**Error:unclosed character literal. Because \\s+ should quote with ""
         * instead of ''.
        */
        String[] temp = s.trim().split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for (int i = temp.length - 1; i > 0; i--) {
            reversed.append(temp[i]);
            reversed.append(' ');
        }
        reversed.append(temp[0]);
        return reversed.toString();
    }
}
