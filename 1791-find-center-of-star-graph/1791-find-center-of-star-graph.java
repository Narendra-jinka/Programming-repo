class Solution {
    public int findCenter(int[][] edges) {
        int n = edges.length+1;
        int[] fq = new int[n+1];
        for(int i=0;i<edges.length;i++){
            fq[edges[i][0]] +=1;
            fq[edges[i][1]] +=1;
        }
        for(int i=0;i<n+1;i++){
            if(fq[i] == n-1){
                return i;
            }
        }
        return -1;
    }
}