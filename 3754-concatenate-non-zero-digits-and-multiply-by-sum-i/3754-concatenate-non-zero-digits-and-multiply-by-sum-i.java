class Solution {
    public long sumAndMultiply(int n) {

        if (n == 0) {
            return 0;
        }

        String str = Integer.toString(n);
        String s = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '0') {
                s += str.charAt(i);
            }
        }

        long res = Long.parseLong(s);
        long m = res;
        long sum = 0;

        while (m > 0) {
            long d = m % 10;
            sum += d;
            m /= 10;
        }

        return sum * res;
    }
}