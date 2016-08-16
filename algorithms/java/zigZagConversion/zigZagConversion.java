public class Solution {
    public String convert(String s, int numRows) {
        // special case
        if(numRows == 1 || s.length() <= numRows) return s;

        // construct an empty String[] str to store the each row of characters.
        String[] str = new String[numRows];
        for(int l = 0; l < str.length; l++) {
            str[l] = "";
        }

        int j, i = 0;
        // collect row by row
        while(i < s.length()) {
            /**
            * row 1: 1     7
            * row 2: 2   6 8
            * row 3: 3 5   8
            * row 4: 4     10
            * characters in the same row will be concatenated by "+=".
            */
            // vertical loop
            for(j = 0; j < numRows && i < s.length(); j++) str[j] += s.charAt(i++);
            // oblique loop
            for(j = numRows - 2; j > 0 && i < s.length(); j--) str[j] += s.charAt(i++);
        }

        // concatenate and return the result row by row
        String result ="";
        for(int k = 0; k < numRows; k++) {
            result += str[k];
        }
        return result;
    }
}