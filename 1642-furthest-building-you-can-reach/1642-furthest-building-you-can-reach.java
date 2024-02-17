class Solution {
    public int furthestBuilding(int[] h, int b, int l) {
        PriorityQueue<Integer> stk=new PriorityQueue<>();
        for(int i=0;i<h.length-1;i++){
            int df=h[i+1]-h[i];
            if(df<=0){
                continue;
            }
            if(l > 0){
                stk.add(df);
                l--;
            }
            else if(!stk.isEmpty() && df > stk.peek()){
                b-=stk.remove();
                stk.add(df);
            }
            else{
                b-=df;
            }
            if(b < 0){
                return i;
            }
        }
        return h.length - 1;
    }
}