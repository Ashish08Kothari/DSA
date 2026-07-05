class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().longestPalindrome("babad"));
    }

    public String longestPalindrome(String s) {
        String longest="";
        int n=s.length();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(ispalin(s,i,j)){
                    if(longest.length()<j-i+1){
                        longest=s.substring(i,j+1);
                    }
                }
            }
        }
        return longest;
    }

    public static boolean ispalin(String str,int left,int right){
       while(left<right){
        if(str.charAt(left)!=str.charAt(right)){
            return false;
        }
        left++;right--;
       }return true;
    }
}

/*
    Time Complexity : O(n^3)
    Space Complexity : O(n)
*/