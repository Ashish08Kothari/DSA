class Solution{
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println(sumOfNaturals(n));
    }

    static int sumOfNaturals(int n){
        if(n <= 0) return 0;
        return n + sumOfNaturals(n-1);
    }
}

/*
    Time Complexity: O(n)
    Space Complexity: O(n)
*/