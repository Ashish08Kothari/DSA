class Solution{
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        System.out.println(armstrongNumber(num));
    }

    static boolean armstrongNumber(int num){
        int temp = num, x = 0;

        while(temp != 0){
            int dig = temp % 10;
            temp /= 10;
            x += Math.pow(dig,3);
        }

        return num == x;
    } 
}

//Time Complexity: O(log num)
//Space Complexity: O(1)