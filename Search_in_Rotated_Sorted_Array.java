class Solution {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(new Solution().search(arr,3));
    }

    public int search(int[] arr, int target) {
        int n = arr.length;
        int s = 0, e = n-1;

        while (s <= e) {
            int m = s + (e-s) /2;
            int num = arr[m];
            if (num == target)
                return m;

            if (arr[s] <= num) {
                if (target < num && target >= arr[s])
                    e = m-1;

                else
                    s = m+1;
            }

            else {
                if (target > num && target <= arr[e])
                    s = m+1;

                else
                    e = m-1;
            }
        }

        return -1;
    }
}

/*
    Time Complexity : O(log n)
    Space Complexity : O(1)
 */