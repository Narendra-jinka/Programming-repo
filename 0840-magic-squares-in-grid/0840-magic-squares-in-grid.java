class Solution {
    
    public boolean helper(int[][] grid , int row,int col){
         HashSet<Integer> set=new HashSet<>();
        
        // grid wise checking
         for(int i=row;i<=row+2;i++){
             for(int j=col;j<=col+2;j++){
                 int x=grid[i][j];
                 if((set.contains(x)) || (1>x || x>9)){
                     return false;
                 }
                 set.add(x);
             }
         }
       // System.out.println("grid if finished");
        //row wise checking
         for(int i=row;i<=row+2;i++){
             int sum=0;
             for(int j=col;j<=col+2;j++){
                 sum+=grid[i][j];
             }
             if(sum!=15){
                 return false;
             }
         }
       // System.out.println("row wise is finished");
        //col wise checking
        for(int j=col;j<=col+2;j++){
            int sum=0;
            for(int i=row;i<=row+2;i++){
                sum+=grid[i][j];
            }
            if(sum!=15) return false;
        }
       // System.out.println("col wise is finished");
        //diagonals checking 
        int sum=0;
        int i=row,j=col;
        
        while(i<=row+2 && j<=col+2){
            sum+=grid[i][j];
            i++;j++;
        }
        if(sum!=15){
            return false;
        }
       // System.out.println("d1 wise is finished");
        int ri=row+2,rj=col;
        int rsum=0;
        while(ri>=0 && rj<=col+2){
            rsum+=grid[ri][rj];
            ri--;rj++;
        }
        if(rsum!=15){
            return false;
        }
        
        return true;
    }
    public int numMagicSquaresInside(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        
        
        int res=0;
        if(r<3 || c<3) return 0;
        
        for(int i=0;i<r-2;i++){
            for(int j=0;j<c-2;j++){
                if(helper(grid,i,j)){
                    res++;
                }
            }
        }
        return res;
    }
}