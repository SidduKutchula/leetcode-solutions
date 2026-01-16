class Solution {
    int[][][] dp;

    public int maxProfit(int[] prices) {
        int n = prices.length;
        dp = new int[n][2][2]; // 3D DP: [day][cooldown][canBuy]

        // Initialize DP table to -1 (unvisited)
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < 2; j++) {
                for(int k = 0; k < 2; k++) {
                    dp[i][j][k] = -1;
                }
            }
        }

        return solve(0, n, 0, 1, prices);
    }

    int solve(int i, int n, int cool, int canBuy, int[] p) {
        if(i >= n) return 0; // No more days

        if(dp[i][cool][canBuy] != -1) return dp[i][cool][canBuy];

        if(cool == 1) {
            // Cooldown day: skip to next day, cooldown done
            return dp[i][cool][canBuy] = solve(i + 1, n, 0, 1, p);
        }

        if(canBuy == 1) {
            // Option 1: Buy
            int buy = -p[i] + solve(i + 1, n, 0, 0, p);
            // Option 2: Skip
            int skip = solve(i + 1, n, 0, 1, p);
            return dp[i][cool][canBuy] = Math.max(buy, skip);
        } else {
            // Option 1: Sell
            int sell = p[i] + solve(i + 1, n, 1, 1, p);
            // Option 2: Hold
            int hold = solve(i + 1, n, 0, 0, p);
            return dp[i][cool][canBuy] = Math.max(sell, hold);
        }
    }
}