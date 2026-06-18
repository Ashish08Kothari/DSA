class Solution {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        System.out.println(new Solution().findMin(arr));
    }

    public int findMin(int[] nums) {
        int s = 0, e = nums.length - 1;
        while (s < e) {
            int m = s + (e - s) / 2;
            if (nums[m] > nums[e]) s = m + 1;
            else e = m; 
        }
        return nums[s]; 
    }
}

/*
    Time Complexity : O(log n)
    Space Complexity : O(1)
 */