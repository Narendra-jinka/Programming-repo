class Solution {
    public int minPartitions(String n) {
        int MAX = 0;
        for(char c : n.toCharArray()){
            int x = c - '0';
            if(x > MAX) MAX = x;
        }
        return MAX;
    }
}