class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        return Math.max(maxRob(nums,0,n-2),maxRob(nums,1,n-1));
    }
    private static int maxRob(int nums[],int s,int e){
        int max=0;
        int prev=0;
        for(int i=s;i<=e;i++){
            int temp=max;
            max=Math.max(prev+nums[i],max);
            prev=temp;
        }
        return max;
    }
}