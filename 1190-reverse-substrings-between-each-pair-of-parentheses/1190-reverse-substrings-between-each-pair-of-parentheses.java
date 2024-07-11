class Solution {
    public String reverseParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        Stack<String> stk=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c == ')'){
                sb.reverse();
                if(!stk.isEmpty()) sb.insert(0,stk.pop());
            }
            else if(c == '('){
                stk.push(sb.toString());
                sb.setLength(0);
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}