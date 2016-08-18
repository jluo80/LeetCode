public class Solution {
    public int myAtoi(String str) {
        int result = 0, sign = 1, index = 0;

        // handle empty string
        if(str.length() == 0) return result;

        // trim whitespace in the beginning and end.
        str = str.trim();

        // handle sign
        if(str.charAt(0) == '-' || str.charAt(0) == '+') {
            sign = str.charAt(0) == '-' ? -1 : 1;
            index++;
        }

        // handle overflow issue
        // 1. find out the whole valid string and parseInt, handle overflow issue by catching exception
        // int start = index;
        // while(index < str.length()) {
        //     if(str.charAt(index) >= '0' && str.charAt(index) <= '9') {
        //         index++;
        //     } else {
        //         break;
        //     }

        //     int end = index;
        //     try{
        //         result = Integer.parseInt(str.substring(start, end));
        //     } catch (NumberFormatException e) {
        //         return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        //     }
        // }

        // 2. add up the valid digit one by one, handle overflow issue by determining if result is over MAX_VALUE/10
        while(index < str.length()) {
            int digit = str.charAt(index) - '0';
            if(digit < 0 || digit > 9) break;

            if(Integer.MAX_VALUE / 10 < result || Integer.MAX_VALUE / 10 == result && Integer.MAX_VALUE % 10 < digit) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            index++;
        }
        return result * sign;
    }
}