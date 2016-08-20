public class Solution {
    // 1. Use StringBuilder.reverse() method to reverse the String and compare it to the original one.
    // public boolean isPalindrome(int x) {
    //     boolean flag = false;
    //     String origin = Integer.toString(x);
    //     if(x < 0) return flag;
    //     String reverse = new StringBuilder(origin).reverse().toString();
    //     if(origin.equals(reverse)) flag = true;
    //     return flag;
    // }

    // 2. Use two pointers to iterate character from the beginning and end to test if they are the same.
    public boolean isPalindrome(int x) {
        boolean flag = false;
        String str = Integer.toString(x);
        int start = 0, end = str.length() - 1;
        while(str.charAt(start) == str.charAt(end)) {
            if(start == end || start == end - 1) {
                flag = true;
                return flag;
            }
            start++;
            end--;
        }
        return flag;
    }
}