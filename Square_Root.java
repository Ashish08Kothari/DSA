class Solution {
    int floorSqrt(int n) {
        int s = 1, e = n;
        while (s <= e) {
            int m = s + (e-s) / 2;
            int num = m * m;
            if (num == n) return m;
            else if (num > n) e = m-1;
            else s = m+1;
        }

        return e;
    }
}

/*
    Time Complexity: O(log n)
    Space Complexity: O(1)
*/