class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
       // HashMap<Integer,Integer> map=new HashMap<>();
        Arrays.sort(hand);
       /* for(int i:hand){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        for(int n:hand){
            int start=n;
            
            for(int i=start;i<start+groupSize;i++){
                if(map.containsKey(i)){
                    if(map.get(i)>0){
                        map.put(i,map.get(i)-1);
                    }
                    else{
                        break;
                    }
                }
                else {
                    return false;
                }
            }
        }
        return true;*/
        
       ArrayList<Integer> list=new ArrayList<>();
       for(int i:hand){
           list.add(i);
       }
       int n=list.size();
        for(int i=0;i<n;i++){
            int start=list.get(i);
            
            if(start!=-1){
                for(int j=start;j<start+groupSize;j++){
                    int getindex=list.indexOf(j);
                    if(getindex !=-1 &&list.get(getindex)!=-1){
                        list.set(getindex,-1);
                    }
                    else{
                        return false;
                    }
                    
                }
            }
        }
        return true;
        
        
    }
}