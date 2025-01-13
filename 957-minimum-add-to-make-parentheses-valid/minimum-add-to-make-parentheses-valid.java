class Solution {
    public int minAddToMakeValid(String s) {
        if(s.isEmpty())
            return 0;
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(!stack.isEmpty() && s.charAt(i) == ')' && stack.peek() == '(')
                stack.pop();
            else
                stack.push(s.charAt(i));
        }
        return stack.size();
    }
}