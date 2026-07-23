class Solution {
    public boolean isMatch(String s, String p) {

      
        if (s.isEmpty() && p.isEmpty()) {
            return true;
        }

       
        if (p.isEmpty()) {
            return false;
        }

       
        boolean firstMatch = !s.isEmpty() &&
                (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.');

      
        if (p.length() >= 2 && p.charAt(1) == '*') {

            
            return isMatch(s, p.substring(2)) ||
                   (firstMatch && isMatch(s.substring(1), p));
        }

      
        if (firstMatch) {
            return isMatch(s.substring(1), p.substring(1));
        }

        return false;
    }
}