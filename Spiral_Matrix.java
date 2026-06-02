import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(new Solution().spiralOrder(arr));
    }

    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> list = new ArrayList<>();
        int top = 0, bottom = arr.length-1, left = 0, right = arr[0].length-1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                list.add(arr[top][i]);
            }
            
            top++;

            for (int i = top; i <= bottom; i++) {
                list.add(arr[i][right]);
            }

            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    list.add(arr[bottom][i]);
            }

            bottom--;

            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    list.add(arr[i][left]);
            }

            left++;
        }
        return list;
    }
}

/*
    Time Complexity: O(m * n)
    Space Complexity: O(m * n)
*/