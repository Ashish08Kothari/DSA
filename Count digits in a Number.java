import java.util.Scanner;
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
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(Solution.countDigits(n));
    }
}



//Time Complexity: O(log10 n)
//Space Complexity: O(1)