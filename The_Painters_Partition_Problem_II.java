class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().minTime(new int[]{5, 10, 30, 20, 15}, 3));
    }

    public int minTime(int[] arr, int k) {
        int s = 0, e = 0;
        for (int z : arr) {
            s = Math.max(s,z);
            e += z;
        }
        while (s <= e) {
            int m = s + (e-s) / 2;
            if (canPaint(arr,k,m)) e = m-1;
            else s = m+1;
        }

        return s;
    }

    boolean canPaint(int[] arr, int k, int m) {
        int cnt = 1, len = 0;
        for (int z : arr) {
            if(len + z <= m) len += z;
            else {
                cnt++;
                len = z;
            }
        }
        return cnt <= k;
    }
}

/*
    Time Complexity : O(n log m)
    Space Complexity : O(1)
*/