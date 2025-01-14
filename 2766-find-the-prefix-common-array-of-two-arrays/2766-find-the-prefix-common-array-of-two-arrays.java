class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n= A.length;
        int res[] = new int[n];
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            int c=0;
            if(set.contains(A[i])){
                c++;
            }
            if(set.contains(B[i])){
                c++;
            }
            if(A[i]==B[i]){
                c=1;
            }
            if(i==0) res[i]=c;
            else{
                res[i]=res[i-1]+c;
            }
            set.add(A[i]);
            set.add(B[i]);
        }
        return res;
    }
}