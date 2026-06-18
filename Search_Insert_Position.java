class Solution {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        System.out.println(new Solution().searchInsert(arr,7));
    }

    public int searchInsert(int[] arr, int target) {
        int n = arr.length;
        int s = 0, e = n-1;
        while (s <= e) {
            int m = s + (e-s) / 2;
            if(arr[m] == target)
                return m;

            else if(arr[m] < target)
                s = m+1;

            else
                e = m-1;
        }

        return s;
    }
}

/*
    Time Complexity : O(log n)
    Space Complexity : O(1)
 */