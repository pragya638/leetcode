class Solution {
    public long countCommas(long n) {
        long res = 0;

        if (n >= 1000)
            res += n - 999;

        if (n >= 1000000)
            res += n - 999999;

        if (n >= 1000000000)
            res += n - 999999999;

        if (n >= 1000000000000L)
            res += n - 999999999999L;

        if (n >= 1000000000000000L)
            res += n - 999999999999999L;

        return res;
    }
}