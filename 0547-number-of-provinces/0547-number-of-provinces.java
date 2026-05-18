class Solution {
    Set<Integer> set;
    public List<List<Integer>> convertToAdj(int[][] isConnected) {

        int n = isConnected.length;
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            res.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isConnected[i][j] == 1 && i != j) {
                    res.get(i + 1).add(j + 1);
                }
            }
        }
        return res;
    }

    public void dfs(int u,List<List<Integer>> adj){
        set.add(u);
        for(int v:adj.get(u)){
            if(!set.contains(v)){
                dfs(v,adj);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        List<List<Integer>> adj = convertToAdj(isConnected);
        set = new HashSet<>();
        int n = isConnected.length;
        int count=0;
        for(int i=1;i<=n;i++){
           if(!set.contains(i)){
                count++;
                dfs(i,adj);
           }
        }
        return count;

    }
}