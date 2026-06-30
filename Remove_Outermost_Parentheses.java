class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().removeOuterParentheses("(()())(())"));
    }

    public String removeOuterParentheses(String st) {
        int cnt = 0;
        StringBuilder s = new StringBuilder();
        for (char c : st.toCharArray()) {
            if (c == '(') {
                cnt++;
                if (cnt > 1) s.append(c);
            }else {
                if (cnt > 1) s.append(c);
                cnt--;
            }
        }

        return s.toString();
    }
}

/*
    Time Complexity : O(n)
    Space Complexity : O(n)
*/