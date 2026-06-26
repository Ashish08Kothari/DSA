class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().splitArray(new int[]{1,2,3,4,5}, 2));
    }

    public int splitArray(int[] arr, int k) {
        int n = arr.length;
        if (k > n) return -1;
        int s = 0, e = 0;
        for (int z : arr) {
            s = Math.max(z,s);
            e += z;
        }
        while (s <= e) {
            int m = s + (e-s) / 2;
            if (possible(arr,k,m)) e = m-1;
            else s = m+1;
        }

        return s;
    }

    boolean possible(int[] arr, int k, int m) {
        int cnt = 1, n = arr.length, sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] + sum <= m) sum += arr[i];
            else{
                sum = arr[i];
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