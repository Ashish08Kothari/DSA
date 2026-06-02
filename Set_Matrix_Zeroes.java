import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[][] arr = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        new Solution().setZeroes(arr);
        System.out.println(Arrays.deepToString(arr));
    }

    public void setZeroes(int[][] arr) {
        boolean isRow = false, isCol = false;
        int m = arr.length, n = arr[0].length;

        for (int i = 0; i < m; i++)
            if (arr[i][0] == 0)
                isRow = true;
        
        for (int i = 0; i < n; i++)
            if (arr[0][i] == 0)
                isCol = true;
        
        for (int i = 1; i < m; i++) 
            for (int j = 1; j < n; j++) 
                if (arr[i][j] == 0) {
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
        
        for (int i = 1; i < m; i++)
            for (int j = 1; j < n; j++)
                if (arr[i][0] == 0 || arr[0][j] == 0)
                    arr[i][j] = 0;
        
        if (isRow) {
            for (int i = 0; i < m; i++)
                arr[i][0] = 0;
        }
        
        if (isCol) {
            for (int i = 0; i < n; i++) 
                arr[0][i] = 0;
        }
    }
}

/*
    Time Complexity: O(m * n)
    Space Complexity: O(1)
*/