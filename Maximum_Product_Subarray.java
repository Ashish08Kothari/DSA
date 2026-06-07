class Solution {
    public static void main(String[] args) {
        int[] arr = {-3,0,1,-2};
        System.out.println(bruteForce(arr));
        System.out.println(maxProduct(arr));
    }

    public static int maxProduct(int[] arr) {
        /*
            Time Complexity: O(n)
            Space Complexity: O(1)
        */

        int max = Integer.MIN_VALUE, product = 1;
        for (int i = 0; i < arr.length; i++) {
            if (product == 0)
                product = 1;

            product *= arr[i];
            max = Math.max(max, product);
        }

        product = 1;

        for (int i = arr.length-1; i >= 0; i--) {
            if (product == 0)
                product = 1;

            product *= arr[i];
            max = Math.max(max, product);
        }

        return max;
    }

    static int bruteForce(int[] arr) {
        /*
            Time Complexity: O(n^2)
            Space Complexity: O(1)
        */

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int product = 1;
            for (int j = i; j < arr.length; j++) {
                product *= arr[j];
                max = Math.max(max,product);
            }

            max = Math.max(max, product);
        }

        return max;
    }
}