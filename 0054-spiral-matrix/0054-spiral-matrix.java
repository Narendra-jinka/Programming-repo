class Solution {
    public List<Integer> spiralOrder(int[][] M) {
        int n=M.length;
        int m=M[0].length;
        //int ans[]=new int[n*m];
        ArrayList<Integer> ans=new ArrayList<>();
        int k=0;
        //col 
        int left=0 ,right=m-1;
        //row
        int top=0, bottom = n-1;

        while(top<=bottom && left<=right){
            //left -> right (top row fixed)
            for(int i=left;i<=right;i++){
                ans.add(M[top][i]);
            }
            top++;

            // top -> bottom (right col fixed)
            for(int i=top;i<=bottom;i++){
                ans.add(M[i][right]);
            }
            right--;

            //right -> left (bottom row fixed)
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                   
                    ans.add(M[bottom][i]);
                }
                bottom--;
            }
            

            //bottom -> top (left col fixed)
            if(left<=right){
                for(int i=bottom; i>=top; i--){
                    ans.add(M[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}