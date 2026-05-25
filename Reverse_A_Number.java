class Solution{
    public static void main(String... args){
        int n = Integer.parseInt(args[0]);
        Solution obj = new Solution();
        System.out.println(obj.reverse(n));
    }

    public int reverse(int x){
        int sign = x >= 0 ? 1 : -1;
        x = Math.abs(x);
        int max = Integer.MAX_VALUE / 10, min = Integer.MIN_VALUE / 10;
        int ans = 0;
        while(x != 0){
            if(ans > max || ans < min) return 0;
            ans *= 10;
            ans += x % 10;
            x /= 10;
        }

        return ans * sign;
    }
}

//Time Complexity: O(log10 n)
//Space Complexity: O(1)

