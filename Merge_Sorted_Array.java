import java.util.Arrays;

class Solution {
    public void merge(int[] arr1, int m, int[] arr2, int n) {
        int i = m-1, j = n-1, k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (arr1[i] > arr2[j]) {
                arr1[k--] = arr1[i--];
            }
            else {
                arr1[k--] = arr2[j--];
            }
        }

        while (j >= 0) {
            arr1[k--] = arr2[j--];
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,0,0,0}, arr2 = {2,5,6};
        new Solution().merge(arr1, 3, arr2, 3);

        System.out.println(Arrays.toString(arr1));
    }
}

/*
    Time Complexity: O(m+n)
    Space Complexity: O(1)
*/