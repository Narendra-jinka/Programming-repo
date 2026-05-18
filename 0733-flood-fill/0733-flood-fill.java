class Pair{
    int r;
    int c;
    public Pair(int r,int c){
        this.r=r;
        this.c = c;
    }
}

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        Queue<Pair> q = new LinkedList<>();
        int r=image.length;
        int c = image[0].length;
        q.offer(new Pair(sr,sc));
        int temp = image[sr][sc];
        int[] dr = {-1,0,1,0};
        int[] dc = {0,1,0,-1};
        while(!q.isEmpty()){
            Pair p = q.poll();
            image[p.r][p.c] = color;
            for(int k=0;k<4;k++){
                int nr = dr[k]+p.r;
                int nc = dc[k]+p.c;

                if((nr > -1 && nr < r) &&
                (nc > -1 && nc < c) && 
                image[nr][nc] == temp && image[nr][nc] != color ){
                    q.offer(new Pair(nr,nc));
                    image[nr][nc] = color;
                }
            }

        }

        return image;
    }
}