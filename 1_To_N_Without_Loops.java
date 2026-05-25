class Solution{
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        new Solution().printTillN(n);
    }

    public void printTillN(int n){
        helper(n, 1);
    }

    void helper(int n, int a){
        if(a > n) return;
        System.out.print(a+" ");
        helper(n, a+1);
    }
}

/*
    Time Complexity: O(n)
    Space Complexity: O(n)
*/