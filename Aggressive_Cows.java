import java.util.Arrays;
class Solution {
    public int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int n = stalls.length;
        int s = 1, e = stalls[n-1] - stalls[0];
        while (s <= e) {
            int m = s + (e-s) / 2;
            if (possible(stalls,k,m)) s = m+1;
            else e = m-1;
        }
        
        return e;
    }
    
    boolean possible(int[] arr, int k, int dis) {
        int prev = arr[0];
        k--;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= prev + dis) {
                k--;
                prev = arr[i];
            }
            
            if (k == 0) return true;
        }
        
        return false;
    }
    
    public static void main(String[] args) {
        System.out.println(new Solution().aggressiveCows(new int[]{1, 2, 4, 8, 9}, 3));
    }
}

/*
    Time Complexity : O(n log n + n log m)
    Space Complexity : O(log n)
*/