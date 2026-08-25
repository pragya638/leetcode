class Solution {
    public int maxNumberOfBalloons(String s) {

        int b = 0, a = 0, l = 0, o = 0, n = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == 'b') b++;
            else if (ch == 'a') a++;
            else if (ch == 'l') l++;
            else if (ch == 'o') o++;
            else if (ch == 'n') n++;
        }

        return Math.min(
            Math.min(b, a),
            Math.min(l / 2, Math.min(o / 2, n))
        );
    }
}