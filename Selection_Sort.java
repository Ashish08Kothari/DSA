import java.util.Arrays;

class Solution{
    public static void main(String[] args) {
        int[] arr = new int[]{4,5,6,3,2,8,7,90,23};
        new Solution().selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    void selectionSort(int[] arr) {
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}

/*
    Time Complexity: O(n^2)
    Space Complexity: O(1)
*/