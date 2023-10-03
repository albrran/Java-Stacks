class Solution {
    public String removeStars(String s) {
        if(s.length() < 1) {
            return s;
        }
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '*' && !stack.isEmpty()) {
                stack.pop();
            } else if (s.charAt(i) != '*') {
                stack.push(s.charAt(i));
            }
        } 
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop());
        }
        return result.toString();
    }
}