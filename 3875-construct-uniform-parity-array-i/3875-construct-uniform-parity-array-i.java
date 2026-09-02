class Solution {
    public boolean uniformArray(int[] nums) {
       boolean res=false;
       int n=nums.length;
       for(int i=0;i<n;i++){
        if(nums[i]%2==0||i > 0 && Math.abs(nums[i] - nums[i-1]) == 1){
            res=true;
        }
       } 
       return true;
    }
}