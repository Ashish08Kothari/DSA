class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().nthRoot(4,16));
    }

    public int nthRoot(int n, int m) {
        if ( m == 0) return m;
        int s = 1, e = m;
        while (s <= e) {
            int mid = s + (e-s) / 2;
            int num = (int)Math.pow(mid,n);
            if(num == m) return mid;
            else if (num > m) e = mid - 1;
            else s = mid + 1;
        }

        return -1;
    }
}

/*
    Time Complexity: O(log m)
    Space Complexity: O(1)
*/