class Solution {
    public static void main(String[] args) {
        int[] arr = {5, 1, 2, 3, 4};
        System.out.println(new Solution().findKRotation(arr));
    }

    public int findKRotation(int[] arr) {
        // for (int i = 1; i < arr.length; i++) {
        //     if (arr[i] < arr[i-1])
        //         return i;
        // }

        // return 0;

        int n = arr.length;
        int s = 0, e = n-1;
        while (s < e) {
            int m = s + (e-s) / 2;
            if (arr[m] > arr[e])
                s = m+1;
            else
                e = m;
        }

        return e;
    }
}

/*
    Time Complexity : O(log n)
    Space Complexity : O(1)
 */