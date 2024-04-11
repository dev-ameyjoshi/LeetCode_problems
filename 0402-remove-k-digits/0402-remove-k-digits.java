class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();
        
        //To check if the stack is empty or not. and if current element is > the top element in the stack. 
        for(char digit : num.toCharArray()){
            while(!stack.isEmpty() && k > 0 && stack.peek() > digit){
                stack.pop();
                k--;
            }
            stack.push(digit);
        }
        //removing remaining k digits from the end of the stack.
        while(k > 0 && !stack.isEmpty()){
            stack.pop();
            k--;
        }
        
        //Constructing the resulting string from the stack.
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        
        sb.reverse();
        
        while(sb.length() > 0 && sb.charAt(0) == '0'){
            sb.deleteCharAt(0);
        }
        
        return sb.length() > 0 ? sb.toString() : "0";
    }
}