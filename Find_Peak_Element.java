class Solution {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        System.out.println(new Solution().findPeakElement(arr));
    }

    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int s = 0, e = n - 1;
        
        while (s < e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] < nums[mid + 1]) {
                s = mid + 1;
            } 
            else {
                e = mid;
            }
        }
        return s;
    }
}

/* 
    Time Complexity : O(log n)
    Space Complexity : O(1) 
*/