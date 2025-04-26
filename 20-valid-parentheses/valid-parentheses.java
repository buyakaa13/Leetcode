class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        char[] array = s.toCharArray();
        for(char c: array){
            if(c == '(' || c == '{' || c == '[')
                stack.push(c);
            else {
                if(stack.isEmpty()) return false;
                char popChar = stack.pop();
                if(c == ')' && popChar != '(') return false;
                else if(c == '}' && popChar != '{') return false;
                else if(c == ']' && popChar != '[') return false;
            }
        }
        return stack.isEmpty() ? true : false;
    }
}