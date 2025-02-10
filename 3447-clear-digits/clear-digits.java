class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack = new Stack();
        for(char c: s.toCharArray()){
            if(Character.isLetter(c))
                stack.push(c);
            else if(Character.isDigit(c)){
                if(!stack.isEmpty())
                    stack.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Character item : stack) 
            sb.append(item);
        return sb.toString();
    }
}