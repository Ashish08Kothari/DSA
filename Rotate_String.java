class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().rotateString("abcde","bcdea"));
    }

    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        return (s+s).indexOf(goal) != -1;
    }
}

/*
    Time Complexity : O(n)
    Space Complexity : O(n)
*/