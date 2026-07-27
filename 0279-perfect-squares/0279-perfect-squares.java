class Solution {
    public int numSquares(int n) {
       ArrayList<Integer> list = new ArrayList<>();

for (int i = 1; i * i <= n; i++) {
    list.add(i * i);
}
int[] arr = list.stream()
                  .mapToInt(Integer::intValue)
                  .toArray();
int len=arr.length;
int dp[][]=new int[len+1][n+1];
for(int []rows : dp){{
    Arrays.fill(rows,-1);
}}
int res=Square(len,arr,n,dp);

return res;
    }
    public static int Square(int len,int arr[],int n,int dp[][]){
       if (n < 0)
    return Integer.MAX_VALUE;

if (n == 0)
    return 0;

if (len == 0)
    return Integer.MAX_VALUE;

    if(dp[len][n]!=-1){
        return dp[len][n];
    }

int take = Integer.MAX_VALUE;
int ans = Square(len, arr, n - arr[len - 1],dp);

if (ans != Integer.MAX_VALUE)
    take = 1 + ans;

int notTake = Square(len - 1, arr, n,dp);


  dp[len][n]=Math.min(take, notTake);
 return dp[len][n];
    }
}