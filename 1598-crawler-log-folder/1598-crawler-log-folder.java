class Solution {
    public int minOperations(String[] logs) {
      /*  Stack<String> stack=new Stack<>();
        stack.push("Main");
        for(String s:logs){
            if(s.equals("../")){
                if(!stack.isEmpty()) stack.pop();
                else continue;
            }
            else if(s.equals("./")) continue;
            else{
                stack.push(s);
            }
        }
        int count=0;
        
        while(!stack.isEmpty()){
            String s=stack.pop();
           // System.out.println(s);
            if(s.equals("Main")) break;
            else count++;
            
        }
        return count;*/
        
        int count= 0;
        for(String s:logs){
            if(s.equals("../")){
                if(count > 0) count = count-1;
                else continue;
            }
            else if(s.equals("./")){
                continue;
            }
            else{
                count = count +1;
            }
        }
        return count;
    }
}