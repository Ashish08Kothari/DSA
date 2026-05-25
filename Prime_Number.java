class Solution{
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println(isPrime(n));
    }

    static boolean isPrime(int n){
        if(n <= 1) return false;
        for(int i = 2; i*i <= n; i++)
            if(n % i == 0)
                return false;
        
        return true;
    }
}

/*
    Time Complexity: O(√n)
    Space Complexity: O(1)
 */