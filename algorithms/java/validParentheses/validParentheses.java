public class Solution {
    public boolean isValid(String s) {
        Stack<Character> temp = new Stack<>();
        for(char c : s.toCharArray()) {
            if(c == '(') {
                temp.push(')');
            } else if(c == '[') {
                temp.push(']');
            } else if(c == '{') {
                temp.push('}');
            } else if(temp.isEmpty() || temp.pop() != c) {
                return false;
            }
        }
        return temp.isEmpty();
    }
}