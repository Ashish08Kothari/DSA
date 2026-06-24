class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().smallestDivisor(new int[]{44,22,33,11,1},5));
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int s = 1, e = 1;
        for (int z : nums) e = Math.max(z,e);
        while (s <= e) {
            int m = s + (e-s) / 2;
            int total = 0;
            for(int z : nums) total += Math.ceil((double)z/m);
            if (total <= threshold) e = m-1;
            else s = m+1;
        }

        return s;
    }
}

/*
    Time Complexity : O(n log m)
    Space Complexity : O(1)
*/