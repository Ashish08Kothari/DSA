class Solution {
    public int maxSubArray(int[] arr) {
        int ans = Integer.MIN_VALUE, sum = 0;
        for(int z : arr) {
            sum += z;
            ans = Math.max(sum,ans);
            if(sum < 0)
                sum = 0;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {-1,-2,-3,10};
        System.out.println(new Solution().maxSubArray(arr));
    }
}

/*
    Time Complexity: O(n)
    Space Complexity: O(1)

    Kadane's Algorithm
*/