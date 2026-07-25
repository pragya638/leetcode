class Solution {
    public   static int coinSum(int n,int coins[],int amount,int dp[][]){
        if(amount==0){
            return 1;
        }
        if(n==0||amount<0){
            return 0;
        }
        if(dp[n][amount]!=-1){
            return dp[n][amount];
        }
       for(int i=0;i<=n;i++){
        for(int j=0;j<=amount;j++){
            if(j==0){
                dp[i][j]=1;
            }
            else if(i==0){
                dp[i][j]=0;
            }
            else if(coins[i-1]<=j){
                dp[i][j]=dp[i-1][j]+dp[i][j-coins[i-1]];
            }
            else{
                dp[i][j]=dp[i-1][j];
            }
        }
    }
    return dp[n][amount];
    }
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int dp[][]=new  int[n+1][amount+1];
        for(int [] row:dp){
            Arrays.fill(row,-1);
        }
         int res= coinSum(n,coins,amount,dp);
         return res;
          
    }
}
  
