class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0,doub = 0;
        for(int i = 0;i<operations.length;i++){
            if(operations[i].matches("-?\\d+")){
                stack.push(Integer.parseInt(operations[i]));
            }
            else if(operations[i].equals("+")){
                int last = stack.pop();
                int secondlast = stack.peek();
                sum = last + secondlast;
                stack.push(last);
                stack.push(sum);
            }
            else if(operations[i].equals("D")){
                stack.push(stack.peek()*2);
            }
            else{
                stack.pop();
            }
        }
        int res = 0;
        for(int val : stack){
            res += val;
        }
        return res;
    }
}