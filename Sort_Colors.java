import java.util.Arrays;

class Solution {
    public void sortColors(int[] arr) {
        /*
            Time Complexity: O(n)
            Space Complexity: O(1)
        */

        int red_cnt = 0, white_cnt = 0, blue_cnt = 0, idx = 0;
        for(int color : arr) {
            if(color == 0) red_cnt++;
            else if(color == 1) white_cnt++;
            else blue_cnt++;
        }
        
        while(red_cnt-- != 0) arr[idx++] = 0;
        while(white_cnt-- != 0) arr[idx++] = 1;
        while(blue_cnt-- != 0) arr[idx++] = 2;
    }

    public static void main(String[] args) {
        int[] arr = {2,0,1};
        new Solution().sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void sortColorsBruteForce(int[] arr) {
        /*
            Time Complexity: O(n log n)
            Space Complexity: O(log n)
        */

        Arrays.sort(arr);
    }
}