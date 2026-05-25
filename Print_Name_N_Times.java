class Solution{
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        Solution.print(n);
    }

    static void print(int n){
        if(n <= 0) return;
        System.out.print("GFG ");
        print(n-1);
    }
}

/*
    Time Complexity: O(n)
    Space Complexity: O(n)
*/