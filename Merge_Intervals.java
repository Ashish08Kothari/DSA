import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[][] arr = {{1,3},{2,6},{8,10},{15,18}};
        System.out.println(Arrays.deepToString(new Solution().merge(arr)));
    }

    public int[][] merge(int[][] arr) {
        Arrays.sort(arr, (a,b) -> a[0] - b[0]);
        int[] prev = arr[0];
        ArrayList<int[]> list = new ArrayList<>();

        for (int i = 1; i < arr.length; i++) {
            int[] curr = arr[i];
            if (prev[1] >= curr[0]) {
                prev[1] = Math.max(prev[1], curr[1]);
            }

            else {
                list.add(prev);
                prev = curr;
            }
        }

        list.add(prev);

        return list.toArray(new int[list.size()][]);
    }
}


/*
    Time Complexity: O(n log n);
    Space Complexity: O(k);
*/