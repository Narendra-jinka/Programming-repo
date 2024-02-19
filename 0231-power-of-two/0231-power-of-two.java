class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n == Integer.MIN_VALUE) {
            return false; // Integer.MIN_VALUE is not a power of 2
        }
        return (n & (n - 1)) == 0 && n != 0;
    }
}