import java.util.Arrays;

class Solution {
    public int[] searchRange(int[] arr, int target) {
        int f = firstOccurence(arr,target), l = lastOccurence(arr,target);
        return new int[]{f,l};
    }

    int firstOccurence(int[] arr, int target) {
        int s = 0, e = arr.length-1, ans = -1;
        while (s <= e) {
            int m = s + (e-s) / 2;
            if(arr[m] == target) {
                ans = m;
                e = m-1;
            }

            else if (arr[m] < target)
                s = m+1;

            else
                e = m-1;
        }

        return ans;
    }

    int lastOccurence(int[] arr, int target) {
        int s = 0, e = arr.length-1, ans = -1;
        while (s <= e) {
            int m = s + (e-s) / 2;
            if(arr[m] == target) {
                ans = m;
                s = m+1;
            }

            else if (arr[m] < target)
                s = m+1;

            else
                e = m-1;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(new Solution().searchRange(arr,10)));
    }
}


/*
    Time Complexity : O(log n)
    Space Complexity : O(1)
 */