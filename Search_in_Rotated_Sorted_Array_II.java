class Solution {
    public static void main(String... args) {
        int[] arr = {2,5,6,0,0,1,2};
        System.out.println(new Solution().search(arr,0));
    }

    public boolean search(int[] arr, int target) {
        int s = 0, e = arr.length-1;
        while (s <= e) {
            int m = s + (e-s) / 2;
            int num = arr[m];
            if (num == target)
                return true;

            if (num == arr[s] && num == arr[e]) {
                s++;
                e--;
            }

            else if (num >= arr[s]) {
                if(num > target && target >= arr[s])
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

        return false;
    }
}

/* 
    Time Complexity : O(log n)
    Space Complexity : O(1)
*/