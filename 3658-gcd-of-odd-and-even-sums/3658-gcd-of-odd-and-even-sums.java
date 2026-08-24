class Solution {
    public int gcdOfOddEvenSums(int n) {
        int odd=Odd(n);
        int even=Even(n);
        int res=Gcd(odd,even);
        return res;
    }
    public static int Gcd(int x,int y){
        if(y==0){
            return x;
        }
        return Gcd(y,x%y);
    }
    public static int Odd(int a){
        int sum=0,i=1;
        while(a>0){
            sum+=i;
            i+=2;
            a--;
        }
        return sum;
    }
public static int Even(int a){
        int sum=0,i=2;
        while(a>0){
            sum+=i;
            i+=2;
            a--;
        }
        
        return sum;
    }


}