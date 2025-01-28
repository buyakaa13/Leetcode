class Solution {
    public int calPoints(String[] operations) {
        if(operations.length == 0)
            return 0;

        Stack<Integer> stack = new Stack();
        for(String str: operations){
            if(str.equals("+")){
                int one = stack.pop();
                int two = stack.peek();
                stack.push(one);
                stack.push(one + two);
            }
            else if(str.equals("D")){
                if(!stack.isEmpty()){
                    int one = stack.peek();
                    stack.push(one * 2);
                }
            }
            else if(str.equals("C")){
                if(!stack.isEmpty())
                    stack.pop();
            }
            else
                stack.push(Integer.parseInt(str));
        }

        int sum = 0;
        while(!stack.isEmpty()){
            sum += stack.pop();
        }

        return sum;
    }
}