class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i:nums){
            if(map.containsKey(i)){
                int v=map.get(i);
                v++;
                map.put(i,v);

            }
            else{
                 map.put(i,1);
            }
        }
        int max=0;
        int maxKey=0;
       for (Map.Entry<Integer, Integer> e : map.entrySet()){
           int k=e.getKey();
           int v=e.getValue();
            if(v>max){
                maxKey=k;
                max=v;
            }
       }
       return maxKey;
    }
}