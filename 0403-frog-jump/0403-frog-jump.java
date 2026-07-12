class Solution {
    public boolean canCross(int[] stones) {
       Boolean [][] memo=new Boolean[stones.length][stones.length];
       return solve(stones,0,0,memo);

    }
    private boolean solve(int stones[],int pos,int k,Boolean memo[][]){
        if(pos==stones.length-1){
        return true;
    }
        if(memo[pos][k]!=null){
        return memo[pos][k];
        }
        memo[pos][k]= trypos(stones,pos,k+1,memo)
        ||   trypos(stones,pos,k,memo) 
        ||  trypos(stones,pos,k-1,memo);
       return memo[pos][k];
    }
    private boolean trypos(int stones[],int pos,int k,Boolean memo[][]){
        if(k<=0){
            return false;
        }
        int next=stones[pos]+k;
        int nextpos=find(stones,next);
        if(nextpos !=-1){
            return solve(stones,nextpos,k,memo);
        }
        return false;
    }
     private int find(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if(array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}