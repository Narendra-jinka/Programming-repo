class Solution {
    public String[] findRelativeRanks(int[] score) {
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<score.length;i++){
           map.put(score[i],i);
       }
       String[] ans=new String[score.length];
       Arrays.sort(score);
       int count=1;
       for(int i=score.length-1;i>=0;i--){
           if(count == 1){
               int index=map.get(score[i]);
               ans[index]="Gold Medal";
               count++;
           }
           else if(count == 2){
               int index=map.get(score[i]);
               ans[index]="Silver Medal";
               count++;
           }
           else if(count == 3){
               int index=map.get(score[i]);
               ans[index]="Bronze Medal";
               count++;
           }
           else{
               int index=map.get(score[i]);
               ans[index]=""+count;
               count++;
           }
       } 
       
       return ans; 
        
    }
}