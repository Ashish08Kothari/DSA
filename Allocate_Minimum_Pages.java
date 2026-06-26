class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().findPages(new int[]{15, 17, 20}, 5));
    }

    public int findPages(int[] arr, int k) {
        int n = arr.length;
        if (k > n) return -1;
        int s = 0, e = 0;
        for (int page : arr) {
            s = Math.max(page,s);
            e += page;
        }
        while (s <= e) {
            int m = s + (e-s) / 2;
            if (possible(arr,k,m)) e = m-1;
            else s = m+1;
        }

        return s;
    }

    boolean possible(int[] arr, int k, int m) {
        int cnt = 1, n = arr.length, page = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] + page <= m) page += arr[i];
            else{
                page = arr[i];
                cnt++;
            }
        }

        return cnt <= k;
    }
}

/*
    Time Complexity : O(n log m)
    Space Complexity : O(1)
*/