class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (stack.empty()) {
                    return false;
                }
                Character bracket = stack.pop();
                if (bracket != '(') {
                    return false;
                }
            } else if (s.charAt(i) == '}') {
                if (stack.empty()) {
                    return false;
                }
                Character bracket = stack.pop();
                if (bracket != '{') {
                    return false;
                }
            } else if (s.charAt(i) == ']') {
                if (stack.empty()) {
                    return false;
                }
                Character bracket = stack.pop();
                if (bracket != '[') {
                    return false;
                }
            } else {
                stack.push(s.charAt(i));
            }
        }
        
        if (stack.empty()){
        return true;
        } else {
            return false;
        }
    }
}