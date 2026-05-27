import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(arr));
        new Solution().rotate(arr, 3);
        System.out.println(Arrays.toString(arr));
    }

    public void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
    }

    void reverse(int[] arr, int s, int e) {
        while(s < e) {
            int temp = arr[s];
            arr[s++] = arr[e];
            arr[e--] = temp;
        }
    }
}


/*
    Time Complexity: O(n)
    Space Complexity: O(1)
*/