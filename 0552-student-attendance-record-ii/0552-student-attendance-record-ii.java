/*class Solution {

    private void find(int n, String[] arr, StringBuilder sb, int[] count) {
        if (sb.length() == n) {
            if (!sb.toString().contains("aa") && !sb.toString().contains("lll")) {
                count[0]++;
            }
            return;
        }
        if(sb.toString().contains("aa") || sb.toString().contains("lll")){
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            find(n, arr, sb, count);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public int checkRecord(int n) {
        String[] arr = {"p", "a", "l"};
        int[] count = {0};
        find(n, arr, new StringBuilder(), count);
        return count[0] % 1000000007;
    }
}
*/

class Solution {
    public int checkRecord(int n) {
        int MOD = 1000000007;

        // dp[i][j][k] represents the number of valid strings of length i
        // where j is the number of 'a' used (0 or 1) and k is the number of consecutive 'l' (0, 1, 2)
        long[][][] dp = new long[n + 1][2][3];
        
        // Base case: Empty string is valid
        dp[0][0][0] = 1;

        for (int i = 1; i <= n; i++) {
            // End with 'p': Valid for all previous combinations
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    dp[i][j][0] = (dp[i][j][0] + dp[i - 1][j][k]) % MOD;
                }
            }

            // End with 'a': Valid only if we haven't used 'a' before
            for (int k = 0; k < 3; k++) {
                dp[i][1][0] = (dp[i][1][0] + dp[i - 1][0][k]) % MOD;
            }

            // End with 'l': Valid only if the last two characters were not 'll'
            for (int j = 0; j < 2; j++) {
                for (int k = 1; k < 3; k++) {
                    dp[i][j][k] = (dp[i][j][k] + dp[i - 1][j][k - 1]) % MOD;
                }
            }
        }

        long result = 0;
        for (int j = 0; j < 2; j++) {
            for (int k = 0; k < 3; k++) {
                result = (result + dp[n][j][k]) % MOD;
            }
        }

        return (int) result;
    }
}
