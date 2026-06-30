import java.util.Arrays;
class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }

    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int n = strs.length;
        String first = strs[0], last = strs[n-1];
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        while(idx < first.length()) {
            if(first.charAt(idx) == last.charAt(idx))
                sb.append(first.charAt(idx++));
            else
                break;
        }
        return sb.toString();
    }
}

/*
    Time Complexity : O(n log n)
    Space Complexity : O(m)
*/