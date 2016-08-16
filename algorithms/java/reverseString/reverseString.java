public class Solution {
    public String reverseString(String s) {
        // char[] charArray = s.toCharArray();
        StringBuffer result = new StringBuffer(s);
        // for(int i = s.length()-1; i>=0; i--){
        //     result.append(charArray[i]);
        // }
        result = result.reverse();
        return result.toString();
    }
}