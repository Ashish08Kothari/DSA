import java.util.Arrays;

class Solution{
    public boolean isPalindrome(String s){
        StringBuffer sb = new StringBuffer();
        s = s.toLowerCase();
        for(char c : s.toCharArray())
            if(Character.isLetterOrDigit(c))
                sb.append(c);

        return sb.toString().equals(sb.reverse().toString());
    }

    public static void main(String[] args) {
        System.out.print(new Solution().isPalindrome(Arrays.toString(args)));
    }
}

/*
    Time Complexity: O(n)
    Space Complexity: O(n)
*/