class Solution {
    public static void main(String[] args) {
        int[] arr = {0,1,0};
        System.out.println(new Solution().findMaxConsecutiveOnes(arr));
    }

    public int findMaxConsecutiveOnes(int[] arr) {
        int ans = 0, cnt = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 1)
                cnt++;

            else{
                ans = Math.max(ans, cnt);
                cnt = 0;
            }
        }

        ans = Math.max(ans,cnt);

        return ans;
    }
}


/*
    Time Complexity: O(n)
    Space Complexity: O(1)
*/