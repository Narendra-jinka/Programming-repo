class Solution {
    public int findKthNumber(int n, int k) {
        int curr = 1;
        k--; // we already are at position 1

        while (k > 0) {
            long steps = countSteps(n, curr, curr + 1);
            if (steps <= k) {
                // move to next sibling
                curr++;
                k -= steps;
            } else {
                // move to next child
                curr *= 10;
                k--;
            }
        }

        return curr;
    }

    // Count steps between prefix n1 and n2
    private long countSteps(int n, long n1, long n2) {
        long steps = 0;
        while (n1 <= n) {
            steps += Math.min(n + 1, n2) - n1;
            n1 *= 10;
            n2 *= 10;
        }
        return steps;
    }
}
