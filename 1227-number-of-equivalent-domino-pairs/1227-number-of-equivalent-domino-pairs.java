class Solution {
    
    public int numEquivDominoPairs(int[][] dominoes) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int[] d:dominoes){
            int a =  d[0] > d[1] ? d[1] : d[0];
            int b =  d[0] > d[1] ? d[0] : d[1];
            int p = a*10+b;
            map.put(p,map.getOrDefault(p,0)+1);
        }
        int cnt=0;
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            int c=e.getValue();
            
            if(c>=2){
                cnt+= (c*(c-1))/2;
            }
        }
        return cnt;

    }
}
