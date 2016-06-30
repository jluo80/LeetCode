public class Solution {
    public boolean isNumber(String s) {
        /**
        *   In this case, the code just need return the true or false boolean,
        *   instead of specific value of the number.
        */
        String temp = s.trim();
        int i = 0;
        int n = temp.length();
        if (temp.charAt(0) != '+' && temp.charAt(0) != '-') i++;

        /**
        *   Seperate to 3 cases. Integer, decimal and 1. / .1
        */
        // case 1
        while (i < n && Character.isDigit(temp.charAt(i)) i++;
        if (i == n) {
            return true;
        }
        // case 2 and 1. / .1 case
        if (temp.charAt(i) == '.') {
            i++;
            if (i == n) {
                return true;
            }
            while (i < n && Character.isDigit(temp.charAt(i))) i++;
            if (i == n) {
                return true;
            }
        }
        return false;
    }
}