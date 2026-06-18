class Solution {
    public static void main(String... args) {
        int[] arr = {2, 3, 7, 10, 11, 11, 25};
        System.out.print(new Solution().upperBound(arr,100));
    }

    int upperBound(int[] arr, int target) {
        int n = arr.length;
        int s = 0, e = n-1;
        while (s <= e) {
            int m = s + (e-s) / 2;
            if(arr[m] <= target)
                s++;
            else 
                e--;
        }

        return s;
    }
}

/*
    Time Complexity : O(log n)
    Space Complexity : O(1)
*/