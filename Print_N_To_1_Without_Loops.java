class Solution{
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        new Solution().printNos(n);
    }

    void printNos(int n){
        if(n <= 0) return;
        System.out.print(n+" ");
        printNos(n-1);
    }
}

/*
    Time Complexity: O(n)
    Space Complexity: O(n)
*/