class Solution {
    public int arrayNesting(int[] nums) {
        int res=0;
        int n=nums.length;
        boolean visited[]=new boolean[n];
       for(int i=0;i<n;i++){
        if(!visited[i]){
            int start=nums[i],c=0;
            do{
                start=nums[start];
                c++;
                visited[start]=true;
            }while(start!=nums[i]);
            res=Math.max(c,res);
        }
       } 
       return res;
    }
}