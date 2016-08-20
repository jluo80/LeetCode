public class Solution {
    public int romanToInt(String s) {
        // Rome number: I, V, X, L, C, D, M
        // Decimal number: 1, 5, 10, 50, 100, 500, 1000
        // Actually char is a special int. For example:
        // ASCII number: 73, 86, 88, 76, 67, 68, 77
        // Declare a int array to store the rome number
        int[] rome = new int[90];
        // Initial the rome number array, the rest of cells will be 0 by default.
        rome['I'] = 1;
        rome['V'] = 5;
        rome['X'] = 10;
        rome['L'] = 50;
        rome['C'] = 100;
        rome['D'] = 500;
        rome['M'] = 1000;
        // MCMLXXX=1980
        int sum = rome[s.charAt(0)];
        for(int i = 0; i < s.length() - 1; i++) {
            if(rome[s.charAt(i)] >= rome[s.charAt(i + 1)]) {
                sum = sum + rome[s.charAt(i + 1)];
            } else {
                sum = sum + rome[s.charAt(i + 1)] - 2 * rome[s.charAt(i)];
            }
        }
        return sum;
    }
}