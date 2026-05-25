class Solution{
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println(new Solution().factorial(n));
    }

    int factorial(int n){
        if( n == 0 || n == 1 ) return n;
        return n * factorial(n-1);
    }
}

/*
    Time Complexity: O(n)
    Space Complexity: O(n)
*/