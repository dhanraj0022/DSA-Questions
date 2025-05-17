class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;
        long l = 0, r = x / 2, mid;
        while (l <= r) {
            mid = (l + r) / 2;
            if (mid * mid == x) return (int) mid;
            else if (mid * mid < x) l = (int) mid + 1;
            else r = (int) mid - 1;
        }
        return (int) r;
    }
}
