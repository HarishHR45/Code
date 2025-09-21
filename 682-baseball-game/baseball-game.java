class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(String str: operations){
            if(str.equals("C")){
                stack.pop();
            }
            else if(str.equals("D")){
                stack.push(2 * stack.peek());
            }
            else if(str.equals("+")){
                Integer num1 = stack.pop();
                Integer num2 = stack.peek();
                stack.push(num1);
                stack.push(num1 + num2);
            }else{
                stack.push(Integer.parseInt(str));
            }
        }
        int result = 0;
        while(!stack.empty()){
            result += stack.pop();
        }
        return result;
    }
}