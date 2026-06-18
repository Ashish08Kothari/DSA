class Solution {
    public int findFloor(int[] arr, int x) {
        int n = arr.length, ans = -1;
        int s = 0, e = n-1;
        while (s <= e) {
            int m = s + (e-s) / 2;
            if(arr[m] <= x) {
                ans = m;
                s = m+1;
            }
            else {
                e = m-1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        System.out.println(new Solution().findFloor(arr,0));
    }
}

/* Time Complexity : O(log n)
   Space Complexity : O(1)
*/