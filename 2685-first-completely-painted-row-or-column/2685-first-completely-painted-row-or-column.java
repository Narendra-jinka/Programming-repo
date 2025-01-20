class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int m = mat.length;
        int n=mat[0].length;
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        for(int r=0;r<m;r++){
            for(int c=0;c<n;c++){
                ArrayList<Integer> al= new ArrayList<>();
                al.add(r);
                al.add(c);
                map.put(mat[r][c] , al);
            }
        }
        int ans=-1;

        int[] rc = new int[m];
        int[] cc = new int[n];

        for(int i=0;i<m*n;i++){
            int r= map.get(arr[i]).get(0);
            int c=map.get(arr[i]).get(1);
            rc[r] = rc[r]+1;
            if(rc[r] == n){
                ans = i;
                break;
            }
            cc[c] = cc[c]+1;
            if(cc[c] == m){
                ans = i;
                break;
            }
        }


       return ans; 

    }
}