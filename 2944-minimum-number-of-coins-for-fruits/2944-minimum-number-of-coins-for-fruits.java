class Solution {
    public int minimumCoins(int[] prices) {

        int n = prices.length;
        int[] dp = new int[n + 1];

        Arrays.fill(dp, -1);

        return Coins(1, prices, dp);
    }

    private int Coins(int i, int[] prices, int[] dp) {

        
        if (2 * i >= prices.length) {
            return prices[i - 1];
        }

        if (dp[i] != -1) {
            return dp[i];
        }

        int min = Integer.MAX_VALUE;

        
        for (int j = i + 1; j <= 2 * i + 1; j++) {
            min = Math.min(min, Coins(j, prices, dp));
        }

        dp[i] = prices[i - 1] + min;

        return dp[i];
    }
}