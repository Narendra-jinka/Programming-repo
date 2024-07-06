class Solution {
    public int passThePillow(int n, int time) {
        
        int cycle= time/(n-1);
        
        return cycle%2==0 ? (time % (n-1) +1) : (n-time % (n-1));
    }
}