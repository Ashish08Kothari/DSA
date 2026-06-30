class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().largestOddNumber("3966"));
    }

    public String largestOddNumber(String s) {
        for (int i = s.length()-1; i >= 0; i--) {
            if (((s.charAt(i)-'0') % 2) == 1)
                return s.substring(0,i+1);
        }

        return "";
    }
}

/*
    Time Complexity : O(n)
    Space Complexity : O(1)
*/