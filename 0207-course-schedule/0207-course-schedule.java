
class Solution {
    public boolean dfs(int u,  int[] pv , List<List<Integer>> adj,int[] vis){
        vis[u]=1;
        pv[u]=1;
        for(int v:adj.get(u)){
            if(vis[v]==0){
                if(dfs(v,pv,adj,vis)) return true;
            }
            else if(pv[v]==1){
                return true;
            }
        }
        pv[u] = 0;
        return false;
    }
    public boolean canFinish(int nc, int[][] pq) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < nc; i++) adj.add(new ArrayList<>());

        for (int[] pre : pq)
            adj.get(pre[1]).add(pre[0]);

        int[] vis = new int[nc];
        int[] pv = new int[nc];
        for(int i=0;i<nc;i++){
            if(vis[i] == 0){
                if(dfs(i,pv,adj,vis)) return false;
            }
        }
        return true;
    }
}