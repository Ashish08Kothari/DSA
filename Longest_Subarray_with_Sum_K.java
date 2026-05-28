import java.util.HashMap;

class Solution {
    public static void main(String[] args) {
        int arr[] = {10, -10, 20, 30};
        System.out.println(new Solution().longestSubarray(arr, 5));
    }

    public int longestSubarray(int[] arr, int k) {
        int sum = 0, ans = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if(sum == k) {
                ans = i+1;
                continue;
            }

            if(map.containsKey(sum - k))
                ans = Math.max(ans, i - map.get(sum - k));

            if(!map.containsKey(sum))
                map.put(sum, i);
        }

        return ans;
    }
}

/*
    Time Complexity: O(n)
    Space Complexity: O(n)
*/