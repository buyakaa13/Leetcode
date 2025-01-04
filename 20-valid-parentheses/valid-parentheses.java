class Solution {
    public boolean isValid(String text) {
        Stack stack = new Stack();
        for (Character c: text.toCharArray()){
            if (c == '(' || c == '[' || c == '{')
                stack.push(c);
            else if(!stack.isEmpty()){
                if (c == ')' && String.valueOf(stack.peek()).equals("("))
                    stack.pop();
                else if (c == ']' && String.valueOf(stack.peek()).equals("["))
                    stack.pop();
                else if(c == '}' && String.valueOf(stack.peek()).equals("{"))
                    stack.pop();
                else
                    return false;
            }
            else
                return false;
        }
        return stack.size() > 0 ? false : true;
    }
}