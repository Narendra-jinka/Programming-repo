class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int res = 0; // Variable to store XOR of all derived elements
        for (int num : derived) {
            res ^= num; // Compute cumulative XOR
        }
        return res == 0; // If XOR of all elements is zero, valid array exists
    }
}