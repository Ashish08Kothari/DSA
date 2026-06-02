import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] arr = {2,1,5,4};
        new Solution().nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void nextPermutation(int[] arr) {
        int n = arr.length;
        int i = n-2;

        while (i >= 0 && arr[i] >= arr[i+1]) {
            i--;
        }

        if (i < 0) {
            reverse(arr, 0, n-1);
            return;
        }

        int breakPoint = i;
        i = n-1;
        while (arr[i] <= arr[breakPoint]) {
            i--;
        }

        int temp = arr[breakPoint];
        arr[breakPoint] = arr[i];
        arr[i] = temp;

        reverse(arr, breakPoint + 1, n-1);
    }

    void reverse(int[] arr, int s, int e) {
        while (s < e) {
            int temp = arr[s];
            arr[s++] = arr[e];
            arr[e--] = temp;
        }
    }
}


/*
    Time Complexity: O(n)
    Space Complexity: O(1)
    

    Next Permutation Intuition: The goal is to find the next bigger permutation with the smallest possible increase. First, traverse the array from right to left and find the first element that is smaller than its next element; this is called the breakpoint because it is the rightmost position that can be increased. For example, in 2 1 5 4, the breakpoint is 1 since 1 < 5. Everything to the right of the breakpoint (5 4) is already in descending order, meaning it is the largest arrangement possible. Next, find the smallest element greater than the breakpoint on its right side and swap them. Here, 4 is the smallest element greater than 1, so after swapping we get 2 4 5 1. Finally, reverse the portion to the right of the breakpoint's original position, giving 2 4 1 5. Reversing is done because the right part is in descending order, and reversing it produces the smallest possible arrangement, ensuring we get the immediate next permutation rather than skipping any. If no breakpoint exists (e.g., 5 4 3 2 1), the array is already the last permutation, so simply reverse the entire array to get the first permutation (1 2 3 4 5). The algorithm is: find breakpoint → swap with the next greater element on the right → reverse the suffix, which works in O(n) time and O(1) space.
*/