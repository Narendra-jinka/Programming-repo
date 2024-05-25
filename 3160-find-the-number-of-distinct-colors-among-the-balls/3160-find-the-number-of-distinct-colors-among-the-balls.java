class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        int n = queries.length;
        int[] ans = new int[n];
        Map<Integer, Integer> ref = new HashMap<>();
        Map<Integer, Integer> freq = new HashMap<>();
        
        for(int i = 0 ; i < n ; i++) {
            int ball = queries[i][0];
            int color = queries[i][1];
            
            if(ref.containsKey(ball)) {
                int prev = ref.get(ball);
                ref.put(ball, color);
                int val = freq.get(prev);
                val--;
                if(val > 0) {
                    freq.put(prev, val);
                }
                else {
                    freq.remove(prev);
                }
                
                if(freq.containsKey(color)) {
                    freq.put(color, freq.get(color) + 1);
                }
                else {
                    freq.put(color, 1);
                }
            }
            
            else {
                ref.put(ball, color);
                if(freq.containsKey(color)) {
                    freq.put(color, freq.get(color) + 1);
                }
                else {
                    freq.put(color, 1);
                }
            }
            
            ans[i] = freq.size();
        }
        
        
        return ans;
    }
}