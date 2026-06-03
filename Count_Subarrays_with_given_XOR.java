import java.util.HashMap;

class Solution {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1};
        System.out.println(new Solution().subarrayXor(arr, 0));
    }

    public long subarrayXor(int[] arr, int k) {
        long cnt = 0;
        int xor = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int z : arr) {
            xor ^= z;

            if (map.containsKey(xor ^ k)) 
                cnt += map.get(xor ^ k);

            map.put(xor, map.getOrDefault(xor, 0) + 1);
        }
        return cnt;
    }
}

/*
    Time Complexity: O(n)
    Space Complexity: O(n)
*/