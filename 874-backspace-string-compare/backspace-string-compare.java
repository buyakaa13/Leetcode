class Solution {
    public boolean backspaceCompare(String s, String t) {
        return removeBackspace(s).equals(removeBackspace(t));
    }

    private String removeBackspace(String str){
        Stack stack = new Stack();
        char[] array = str.toCharArray();
        for(int i=0; i<array.length; i++){
            if(array[i] == '#' && !stack.isEmpty())
                stack.pop();
            else if(array[i] != '#')
                stack.push(array[i]);
        }

        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}