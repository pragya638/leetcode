class Solution {
    public int missingMultiple(int[] nums, int k) {

        HashSet<Integer> hash = new HashSet<>();

        for(int num : nums) {
            hash.add(num);
        }

        for(int i = k; ; i += k) {
            if(!hash.contains(i)) {
                return i;
            }
        }
    }
}