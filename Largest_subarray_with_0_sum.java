import java.util.HashMap;

class Solution {
    public static void main(String[] args) {
        int[] arr = {2, 10, 4};
        System.out.println(new Solution().maxLength(arr));
    }

    int maxLength(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = 0, sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == 0)
                max = i + 1;

            if (map.containsKey(sum)) {
                max = Math.max(max, i - map.get(sum));
            }

            if (!map.containsKey(sum))
                map.put(sum, i);
        }
        return max;
    }
}

/*
    Time complexity: O(n)
    Space Complexity: O(n)
*/