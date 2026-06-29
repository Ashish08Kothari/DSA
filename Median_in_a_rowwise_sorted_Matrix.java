class Solution {
    public static void main(String[] args) {
        int[][] arr = {{1, 3, 5},{2, 6, 9},{3, 6, 9}};
        System.out.println(new Solution().median(arr));
    }

    public int countSmallerThanEqual(int[]row, int x) {
        int low = 0;
        int high = row.length - 1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(row[mid] <= x) low = mid + 1;
            else high = mid - 1;
        }
        return low;
    }
    public int median(int[][] matrix) {
        int R = matrix.length;
        int C = matrix[0].length;
        int low = Integer.MIN_VALUE;
        int high = Integer.MAX_VALUE;
        int required = (R * C) / 2;
        while(low <= high) {
            int mid = (low + high) / 2;
            int count = 0;
            for(int i=0;i<R;i++) {
                count += countSmallerThanEqual(matrix[i], mid);
            }
            if (count <= required) low = mid + 1;
            else high = mid - 1;
        }
        return low;
    }
}