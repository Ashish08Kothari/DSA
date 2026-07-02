class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().maxDepth("(1+(2*3)+((8)/4))+1"));
    }

    public int maxDepth(String s) {
        int max = 0, cnt = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                cnt++;
                max = Math.max(max,cnt);
            }
            else if (c == ')') cnt--;
        }

        return max;
    }
}

/*
    Time Complexity : O(n)
    Space Complexity : O(1)
*/