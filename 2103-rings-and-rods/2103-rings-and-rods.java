class Solution {
    public int countPoints(String rings) {
       
        boolean[] blue=new boolean[10];
        boolean[] red=new boolean[10];
        boolean[] green=new boolean[10];
        for(int i=0;i<rings.length();i+=2){
            if(rings.charAt(i)=='B'){
                blue[rings.charAt(i+1)-'0']=true;
            }
             if(rings.charAt(i)=='R'){
                red[rings.charAt(i+1)-'0']=true;
            }
             if(rings.charAt(i)=='G'){
                green[rings.charAt(i+1)-'0']=true;
            }

        }
        int count=0;
        for(int i=0;i<10;i++){
            if(blue[i]==true && red[i]==true && green[i]==true){
                
                count++;
            }

        }return count;

    }
}