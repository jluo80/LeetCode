public class Solution {
    public int getSum(int a, int b) {
        // bitwise manipulation

        // ^ is used to add up two integers. However, it cannot represent
        // the case when there is a carry bit happens.
        // The bitwise ^ operator performs a bitwise exclusive OR operation.
        // e.g: 0101 ^ 0011 = 0110 ignores the carry bit(1 + 1 = 0 and 1 carry bit)

        // & is used to find the carry bit between two integers.
        // The bitwise & operator performs a bitwise AND operation.
        // e.g: 0101 & 0011 = 0001 means there is one carry bit.
        while(b != 0) {
            int carry = a & b; // a plus b (or carry bit). If there is still a carry bit after addtion, keep looping.
            a = a ^ b; // no carry yet. e.g: 900 + 100 = 000
            b = carry << 1; // set b equals to the carry number, e.g: 0001 => 0010
        }
        return a;
    }
}