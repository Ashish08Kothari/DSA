import java.util.Arrays;
class Solution {
    public static void main(String[] args) {
        int[][] arr = {{0,0,0,1},{0,1,1,1}};
        int ans = new Solution().rowAndMaximumOnes(arr);
        System.out.println(ans);
    }

    public int rowAndMaximumOnes(int[][] arr) {
        int m = arr.length, n = arr[0].length;
        int max = 0, idx = -1, i = 0;
        for (int[] z : arr) {
            int s = 0, e = n-1;
            while (s <= e) {
                int mid = s + (e-s) / 2;
                if (z[mid] == 1) e = mid-1;
                else s = mid+1;
            }
            int cnt = n - s;
            if (cnt > max) {
                max = cnt;
                idx = i;
            }
            i++;
        }

        return idx;
    }
}

/*
    Time Complexity : O(m log n)
    Space Complexity : O(1)
*/