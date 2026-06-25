class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().findKthPositive(new int[]{2,3,4,7,11}, 5));
    }

    public int findKthPositive(int[] arr, int k) {
        int s = 0, e = arr.length-1;
        while (s <= e) {
          int m = s + (e-s) / 2;
          int missing = arr[m] - (m+1);
          if (missing < k) s = m+1;
          else e = m-1;
       }

       return s + k;
    }
}

/*
    Time Complexity : O(log n)
    Space Complexity : O(1)
*/