class Solution{
    public static int countDigits(int n){
        int count = 0;
        while(n != 0){
            count++;
            n /= 10;
        }

        return count;
    }

    public static void main(String... args){
        int n = Integer.parseInt(args[0]);
        System.out.println(Solution.countDigits(n));
    }
}



//Time Complexity: O(log10 n)
//Space Complexity: O(1)