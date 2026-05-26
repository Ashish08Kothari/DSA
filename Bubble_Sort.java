import java.util.Arrays;

class Solution{
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,45,67,32,23,6,4,90,56};
        new Solution().bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean flag = false;
        for(int i = 0; i < n; i++) {
            flag = false;
            for(int j = 0; j < n-i-1; j++) {
                if(arr[j] > arr[j+1]){
                    flag = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(!flag)
                break;
        }
    }
}

/*
    Time Complexity: O(n^2)
    Space Complexity: O(1)
*/