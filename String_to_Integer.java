class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().myAtoi("1337c0d3"));
    }

    public int myAtoi(String s) {
        int i = 0, n = s.length(), ans = 0, sign = 1;

        while (i < n && s.charAt(i) == ' ') i++;

        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-'))
            if (s.charAt(i++) == '-')
                sign = -1;

        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            if (ans > Integer.MAX_VALUE / 10
            || (ans == Integer.MAX_VALUE / 10 && digit > 7)) 
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            
            ans *= 10;
            ans += digit;

            i++;
        }

        return ans * sign;
    }
}

/*
    Time Complexity : O(n)
    Space Complexity : O(1)
*/