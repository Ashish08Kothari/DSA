class Solution {
    public static void main(String[] args) {
        int[][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(new Solution().searchMatrix(arr,3));
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int s = 0, e = m * n -1;
        
        while (s <= e) {
            int mid = s + (e-s) / 2;
            int row = mid / n, col = mid % n;
            int num = matrix[row][col];
            if (target == num) return true;
            else if (num < target) s = mid + 1;
            else e = mid - 1;
        }

        return false;
    }
}

/*
    Time Complexity : O(log m*n)
    Space Complexity : O(1)
*/