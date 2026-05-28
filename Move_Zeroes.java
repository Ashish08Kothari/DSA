import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] arr = {0,0,0,1,2,0,0,3,4,0,0};
        new Solution().moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void moveZeroes(int[] arr) {
        int ptr = 0, len = arr.length;
        for (int i = 0; i < len; i++) {
            if(arr[i] != 0)
                arr[ptr++] = arr[i];
        }

        while (ptr < len)
            arr[ptr++] = 0;
    }
}


/*
    Time Complexity: O(n)
    Space Complexity: O(1)
*/