class Solution {
    public boolean judgeCircle(String moves) {
        int l=0,r=0,u=0,d=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='L'){
                l++;
            }
            if(moves.charAt(i)=='R'){
                r++;
            }
            if(moves.charAt(i)=='U'){
                u++;
            }
            if(moves.charAt(i)=='D'){
                d++;
            }
        }
        if(l==r&&u==d&&l%2==r%2&&u%2==d%2 ){
           return true;
        }
       return false; 
    }
}