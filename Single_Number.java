class Solution {
    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(new Solution().singleNumber(arr));
    }

    public int singleNumber(int[] arr) {
        int xor = 0;
        for(int z : arr)
            xor ^= z;

        return xor;
    }
}

/*
    Time Complexity: o(n)
    Space Complexity: O(1)
*/