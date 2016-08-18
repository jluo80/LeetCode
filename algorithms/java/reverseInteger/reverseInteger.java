public class Solution {
    public int reverse(int x) {
        int sign = x < 0 ? -1 : 1;
        String num = Math.abs(x) + "";
        String reverse = new StringBuilder(num).reverse().toString();
        int result = 0;
        try{
        // parseInt(“00001”) will output 1.
            result = Integer.parseInt(reverse);
        } catch (NumberFormatException e) {
            return 0;
        }
        return sign * result;
    }
}