class Pair {
    int r;
    int c;
    int t;
    public Pair(int r,int c, int t){
        this.r= r;
        this.c = c;
        this.t = t;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] vis = new int[m][n];
        int fresh =0;
        Queue<Pair> q = new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 2){
                    q.offer(new Pair(i,j,0));
                    vis[i][j] = 2;
                }else{
                    if(grid[i][j] == 1) fresh++;
                    vis[i][j] =0;
                }
            }
        } 
        int time =0;
        int c=0;
        int[] dr = {-1,0,1,0};
        int[] dc = {0,1,0,-1};
        
        while(!q.isEmpty()){
            Pair p = q.poll();
            time = Math.max(time,p.t);
            for(int k=0;k<4;k++){
                int nr = p.r+dr[k];
                int nc = p.c + dc[k];
                if((nr > -1 && nr < m) &&
                    (nc > -1 && nc < n) && 
                    vis[nr][nc] == 0 &&
                    grid[nr][nc] ==1){
                        q.offer(new Pair(nr,nc,p.t+1));
                        vis[nr][nc]=2;
                        c++;
                    }
            }
        }
        return (fresh != c) ? -1 : time; 
    }
}