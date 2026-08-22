class Solution {
    public int sum(int num){
        int n=num;
        int sum=0;
        while(n>0){
            int d=n%10;
            sum+=d;
            n/=10;
        }
        return sum;
    }
    public int pro(int num){
        int n=num;
        int pro=1;
        while(n>0){
            int d=n%10;
            pro*=d;
            n/=10;
        }
        return pro;
    }
    public boolean checkDivisibility(int n) {
        int res=0;
      int k=sum(n);
      int l=pro(n);  
       res=k+l;

if(res==0){
    return false;
}
return n%res==0;
    }
}