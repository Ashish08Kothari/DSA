import java.util.Arrays;

class Solution {
    public void quickSort(int[] arr, int low, int high) {
        if(low < high){
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[low], i = low, j = high;
        while(i < j){
            while(arr[i] <= pivot && i < high)
                i++;

            while(arr[j] > pivot && j > low)
                j--;

            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{100,99,89,7,6,-1,0,45,34};
        new Solution().quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}


/*
    Time Complexity: O(n log n)
    Space Complexity: O(log n)
*/