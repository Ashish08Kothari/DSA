import java.util.Arrays;

class Solution{
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,34,23,43,3,5,4,78,67,10};
        new Solution().insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void insertionSort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n ; i++) {
            int j = i;
            while(j > 0 && arr[j] < arr[j-1]) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                
                j--;
            }
        }
    }
}


/*
    Time Complexity: O(n^2)
    Space Complexity: O(1)
*/