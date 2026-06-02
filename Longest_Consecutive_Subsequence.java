import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public static void main(String[] args) {
        int[] arr = {2, 6, 1, 9, 4, 5, 3};
        System.out.println(new Solution().longestConsecutiveBruteForce(arr));
        System.out.println(new Solution().longestConsecutive(arr));
    }

    public int longestConsecutive(int[] arr) {
        /*
            Time Complexity: O(n)
            Space Complexity: O(n)
        */
        
        int max = 0;
        HashMap<Integer,Boolean> map = new HashMap<>();
        for (int z : arr)
            map.put(z,false);

        for(int z : arr) {
            if(map.get(z))
                continue;

            map.put(z, true);
            
            int currLength = 1;
            int next = z+1, prev = z-1;

            while (map.containsKey(next) && !map.get(next)) {
                map.put(next, true);
                currLength++;
                next++;
            }

            while (map.containsKey(prev) && !map.get(prev)) {
                map.put(prev, true);
                currLength++;
                prev--;
            }

            max = Math.max(max,currLength);
        }

        return max;
    }

    public int longestConsecutiveBruteForce(int[] arr) {
        /*
            Time Complexity: O(n log n)
            Space Complexity: O(log n)
        */
        
        if (arr.length == 0)
            return 0;
        
        Arrays.sort(arr);
        int cnt = 1, max = 0, n = arr.length, prev = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] == prev + 1)
                cnt++;
            
            else if (prev == arr[i])
                continue;
            
            else {
                max = Math.max(max,cnt);
                cnt = 1;
            }

            prev = arr[i];
        }

        max = Math.max(max, cnt);

        return max;
    }
}