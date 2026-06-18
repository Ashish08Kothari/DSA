class Solution {
    public static void main(String[] arg) {
        int[] arr = {1, 2, 8, 10, 11, 12, 19};
        System.out.println(new Solution().findCeil(arr,5));
    }

    public int findCeil(int[] arr, int x) {
        int n = arr.length, ans = -1;
        int s = 0, e = n-1;
        while (s <= e) {
            int m = s + (e-s) / 2;
            if (arr[m] >= x) {
                ans = m;
                e = m-1;
            }

            else
                s = m+1;
        }

        return ans;
    }
}

/*
    Time Complexity : O(log n)
    Space Complexity : O(1)
 */