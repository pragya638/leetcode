import java.util.Arrays;
class Solution {
    public int findGCD(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int small=nums[0];
        int large=nums[n-1];
        int res=Gcd(small,large);
        return res;
        
    }
    public static int Gcd(int x,int y){
        if(y==0){
            return x;
        }
        return Gcd(y,x%y);
    }
}