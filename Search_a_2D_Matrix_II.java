class Solution {
    public static void main(String[] args) {
        int[][] arr = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22}};
        System.out.println(new Solution().searchMatrix(arr,3));
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int row = 0, col = n-1;
        while (row < m && col >= 0) {
            int num = matrix[row][col];
            if (num == target) return true;
            else if (num < target) row++;
            else col--;
        }
        return false;
    }
}

/*
    Time Complexity : O(m+n)
    Space Complexity : O(1)
*/