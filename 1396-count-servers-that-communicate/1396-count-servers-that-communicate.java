class Solution {
    public int countServers(int[][] grid) {
        int count = 0;                             // No. of Servers in Communication
        int[] row = new int[grid.length];          // To store no. of servers each row
        int[] col = new int[grid[0].length];       // To store no. of servers each column

        for(int i =0;i<row.length;i++)
        {
            for(int j =0;j<col.length;j++)
            {
                if(grid[i][j]==1){            // Increment server count in row and col          
                    row[i]++;
                    col[j]++;
                }
            }
        }
        for(int i =0;i<row.length;i++)
        {
            for(int j =0;j<col.length;j++)
            {
                if(grid[i][j]==1)
                {
                    if(row[i]>1 || col[j]>1) // Check for another server
                    {
                        count++;
                    }
                }
            }
        }
        return count;
        
    }
}