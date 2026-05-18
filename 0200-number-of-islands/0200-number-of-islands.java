class Pair{
    int i;
    int j;

    public Pair(int i,int j){
        this.i = i;
        this.j = j;
    }
}

class Solution {

    public void bfs(int i, int j, char[][] grid, int[][] vis){

        int n = grid.length;
        int m = grid[0].length;

        Queue<Pair> q = new LinkedList<>();

        q.offer(new Pair(i,j));

        vis[i][j] = 1;

        // 4 directions
        int[] dr = {-1,0,1,0};
        int[] dc = {0,1,0,-1};

        while(!q.isEmpty()){

            Pair p = q.poll();

            for(int k=0;k<4;k++){

                int nr = p.i + dr[k];
                int nc = p.j + dc[k];

                if(nr >= 0 && nr < n &&
                   nc >= 0 && nc < m &&
                   vis[nr][nc] == 0 &&
                   grid[nr][nc] == '1'){

                    vis[nr][nc] = 1;

                    q.offer(new Pair(nr,nc));
                }
            }
        }
    }

    public int numIslands(char[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        int[][] vis = new int[n][m];

        int count = 0;

        for(int i=0;i<n;i++){

            for(int j=0;j<m;j++){

                if(vis[i][j] == 0 &&
                   grid[i][j] == '1'){

                    bfs(i,j,grid,vis);

                    count++;
                }
            }
        }

        return count;
    }
}