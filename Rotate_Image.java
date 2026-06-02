import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        new Solution().rotate(arr);
        System.out.println(Arrays.deepToString(arr));
    }

    public void rotate(int[][] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for (int[] z : arr)
            reverse(z);
    }

    void reverse(int[] arr) {
        int s = 0, e = arr.length-1;
        while (s < e) {
            int temp = arr[s];
            arr[s++] = arr[e];
            arr[e--] = temp;
        }
    }
}

/*
    Time Complexity: O(n * n)
    Space Complexity: O(1)
*/