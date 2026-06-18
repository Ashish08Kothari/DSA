class Solution {
    public static void main(String... args) {
        int[] arr = {1, 1, 2, 2, 2, 2, 3};
        System.out.println(new Solution().countFreq(arr,2));
    }

    int countFreq(int[] arr, int target) {
        int f = firstOccurence(arr,target), l = lastOccurence(arr,target);
        if (f == -1)
            return 0;

        return l-f+1;
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
}

/*
    Time Complexity : O(log n)
    Space Complexity : O(1)
 */