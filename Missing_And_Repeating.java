import java.util.ArrayList;

class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        long n = arr.length;

        long sum = 0, sqSum = 0;

        for (int num : arr) {
            sum += num;
            sqSum += (long) num * num;
        }

        long expectedSum = n * (n + 1) / 2;
        long expectedSqSum = n * (n + 1) * (2 * n + 1) / 6;

        long x = sum - expectedSum; 

        long y = (sqSum - expectedSqSum) / x; 

        long repeating = (x + y) / 2;
        long missing = (y - x) / 2;

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add((int) repeating);
        ans.add((int) missing);

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 2, 1, 1};
        System.out.println(new Solution().findTwoElement(arr));
    }
}


/*
    Time Complexity: O(n)
    Space Complexity: O(1)
*/