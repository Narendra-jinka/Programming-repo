import java.util.Arrays;

class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] res=new int[n];
        if (k == 0) {
            Arrays.fill(code, 0);
        } else if (k > 0) {
            for (int start = 0; start < n; start++) {
                int sum = 0;
                for (int i = 1; i <= k; i++) {
                    sum += code[(start + i) % n];
                }
                res[start] = sum;
            }
        } else { 
            for (int start = 0; start < n; start++) {
                int sum = 0;
                for (int i = 1; i <= Math.abs(k); i++) {
                    sum += code[(start - i + n) % n];
                }
                res[start] = sum;
            }
        }
        return res;
    }
}
