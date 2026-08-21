class Solution {
    public int minimumSwaps(int[] nums) {
        int c=0,zero=0,k=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                zero++;
            }
        }
        for(int i=n-zero; i<n; i++){
    if(nums[i] == 0){
        k++;
    }
}
        return zero-k;
    }
}