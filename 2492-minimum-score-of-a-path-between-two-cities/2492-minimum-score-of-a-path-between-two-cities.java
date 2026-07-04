// class Pair{
//     int dist ;
//     int node ;

//     public Pair(int dist,int node){
//         this.dist = dist ; 
//         this.node = node ;
//     }
// }
// class Solution {

//     public void createAdj(int[][] roads,List<List<Pair>> adj,int n){
//         for (int i = 0; i <= n; i++) {
//             adj.add(new ArrayList<>());
//         }
//         for (int[] road : roads) {
//             int u = road[0];
//             int v = road[1];
//             int d = road[2];
//             adj.get(u).add(new Pair(d, v));
//             adj.get(v).add(new Pair(d, u));
//         }
//     }

//     public int computeScore(List<List<Pair>> adj, int s , int n){
//         PriorityQueue<Pair> pq = new PriorityQueue<>((x,y) -> y.dist - x.dist);

//         int dist[] = new int[n+1];
//         Arrays.fill(dist,Integer.MAX_VALUE);
//         dist[s] = Integer.MAX_VALUE;
//         pq.offer(new Pair(Integer.MAX_VALUE,s));

//         while(!pq.isEmpty()){
//             Pair p = pq.poll();

//             for(Pair v : adj.get(p.node)){
//                 int edge = v.dist;
//                 int node = v.node;
//                 int dis = Math.min(p.dist, edge) ;
//                 if(dist[node] > dis){
//                     dist[node] = dis ;
//                     pq.offer(new Pair(dist[node], node));
//                 }
//             }
//         }
//         return dist[n];
//     }
//     public int minScore(int n, int[][] roads) {
//         List<List<Pair>> adj = new ArrayList<>();
//         createAdj(roads,adj,n);

//         return computeScore(adj, 1, n);
//     }


// }
class Solution {
    public int minScore(int n, int[][] roads) {
        List<int[]>[] g = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) g[i] = new ArrayList<>();

        for (int[] e : roads) {
            g[e[0]].add(new int[]{e[1], e[2]});
            g[e[1]].add(new int[]{e[0], e[2]});
        }

        boolean[] vis = new boolean[n + 1];
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(1);
        vis[1] = true;

        int ans = Integer.MAX_VALUE;

        while (!q.isEmpty()) {
            int u = q.poll();

            for (int[] cur : g[u]) {
                int v = cur[0], w = cur[1];
                ans = Math.min(ans, w);

                if (!vis[v]) {
                    vis[v] = true;
                    q.offer(v);
                }
            }
        }

        return ans;
    }
}