import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] arr, int target) {
        /*
            Time Complexiy: O(n)
            Space Complexity: O(n)
        */

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            if(map.containsKey(target - arr[i]))
                return new int[]{map.get(target-arr[i]), i};

            map.put(arr[i], i);
        }

        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[] arr = {3,2,4};
        System.out.println(Arrays.toString(new Solution().twoSum(arr, 6)));
        System.out.println(Arrays.toString(new Solution().twoSumBruteForce(arr, 6)));
    }

    public int[] twoSumBruteForce(int[] arr, int target) {
        /*
            Time Complexity: O(n^2)
            Space Complexity: O(1)
        */

        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target)
                    return new int[]{i,j};
            }
        }

        return new int[]{-1,-1};
    }
}