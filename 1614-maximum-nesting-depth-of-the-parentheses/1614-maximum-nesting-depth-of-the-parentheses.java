class Solution {
    public int maxDepth(String s) {
        int max=0;
        int maxCount=0;
       Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('){
                stack.push(c);
                max=max+1;
            }
            else if(c==')'){
                stack.pop();
                max--;
            }
            maxCount=Math.max(maxCount,max);
        }
        return maxCount;
    }
}