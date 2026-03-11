class Solution {
    public int bitwiseComplement(int n) {
        if(n==0) return 1;
        int k = (int) (Math.log(n)/Math.log(2))+1;
        return (1<<k)-1-n;
    }
}