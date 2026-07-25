class Solution {

    public int coinChange(int[] coins, int amount) {

        int n = coins.length;

        int[][] dp = new int[n + 1][amount + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        int ans = dpSum(n, coins, amount, dp);

        if (ans == Integer.MAX_VALUE - 1)
            return -1;

        return ans;
    }

    public static int dpSum(int n, int[] coins, int amount, int[][] dp) {

        if (amount == 0)
            return 0;

        if (amount < 0 || n == 0)
            return Integer.MAX_VALUE - 1;

        if (dp[n][amount] != -1)
            return dp[n][amount];

        int notTake = dpSum(n - 1, coins, amount, dp);

        int take = 1 + dpSum(n, coins, amount - coins[n - 1], dp);

        dp[n][amount] = Math.min(take, notTake);

        return dp[n][amount];
    }
}