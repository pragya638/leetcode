class Solution {
    public int distributeCandies(int[] candyType) {
       HashSet<Integer> set=new HashSet<>();
       int n=candyType.length;
       for(int i: candyType){
        set.add(i);
       }
       
       
        return Math.min(set.size(), n / 2);
    }
}