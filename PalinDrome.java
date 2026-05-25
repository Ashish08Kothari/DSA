import java.util.Scanner;
class Solution{
    public boolean isPalindrome(int x){
        if(x < 0) return false;
        int temp = x, n = 0;
        while(x != 0){
            n *= 10;
            n += x % 10;
            x /= 10;
        }

        return n == temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution obj = new Solution();
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        System.out.println(obj.isPalindrome(n));
    }
}

//Time Complexity: O(log10 x)
//Space Complexity: O(1)