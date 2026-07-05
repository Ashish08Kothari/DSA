class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().numberOfSubstrings("pqpqs"));
    }

    public int numberOfSubstrings(String s) {
        int n = s.length();
        return (n * (n+1)) / 2;
    }
}

/*
    Time Complexity : O(1)
    Space Complexity : O(1)
*/