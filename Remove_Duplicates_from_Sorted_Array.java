import java.util.Arrays;

class Solution {
    public int removeDuplicates(int[] arr) {
        int k = 1;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[k-1]) {
                arr[k] = arr[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0,0,1,1,1,2,2,3,3,4};
        Solution obj = new Solution();
        int k = obj.removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(k);
    }
}


/*
    Time Complexity: O(n)
    Space Complexity: O(1)
*/