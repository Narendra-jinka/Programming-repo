class Solution {
    public int fourSumCount(int[] n1, int[] n2, int[] n3, int[] n4) {
       
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:n1){
            for(int j:n2){
                map.put(i+j , map.getOrDefault(i+j,0)+1);
            }
        }
        
        for(int i:n3){
            for(int j:n4){
               count+= map.getOrDefault(-(i+j),0);
            }
        }
        return count;
    }
}