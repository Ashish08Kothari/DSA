import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0, cnt = 0;

        for (int z : nums) {
            sum += z;
            if(map.containsKey(sum - k))
                cnt += map.get(sum - k);

            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().subarraySum(new int[]{1,1,1}, 2));
    }
}


/*
    Time Complexity: O(n)
    Space Complexity: O(n)
*/