class Solution {
    int[] dir = new int[]{-1,0,1,0,-1};
    public boolean isvalidIndex(int n, int xcod,int ycod){
        if(xcod>=0 && xcod<n && ycod>=0 && ycod<n ){
            return true;
        }
        else return false;
    }
    public int countIsLand(int[][] grid, int curland, int n,int x,int y){
        grid[x][y] = curland;
        int count=1;
        for(int i=0;i<4;i++){
            int xcod = x + dir[i];
            int ycod = y+ dir[i+1];
            
             if( isvalidIndex(n,xcod,ycod) && grid[xcod][ycod] == 1){
                count+=countIsLand(grid,curland,n,xcod,ycod);
             }
        }
        return count;
    }
    public int largestIsland(int[][] grid) {
        int n = grid.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int curland=2;
        for(int x=0;x<n;x++){
            for(int y=0;y<n;y++){
                if(grid[x][y]==1){
                    int ilandCount = countIsLand(grid,curland,n,x,y);
                    map.put(curland,ilandCount);
                    curland++;
                }
            }
        }

        int maxArea = 0;

        for(int x=0;x<n;x++){
            for(int y=0;y<n;y++){
                if(grid[x][y] ==0){
                    HashSet<Integer> set = new HashSet<>();
                    for(int i=0;i<4;i++){
                        int xcod = x + dir[i];
                        int ycod = y + dir[i+1];
                        if(isvalidIndex(n,xcod,ycod) && grid[xcod][ycod]!=0){
                            set.add(grid[xcod][ycod]);
                        }
                    }
                    int curArea =1;
                    for(Integer i:set){
                       curArea+=map.get(i);
                    }
                    maxArea = Math.max(maxArea,curArea);
                }
                
            }
        }
        
        return maxArea==0 ? n*n : maxArea;
    }
}