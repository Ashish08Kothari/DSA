class Solution {
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        System.out.println(search(arr, 10));
    }

    public static int search(int[] arr, int target) {
        int s = 0, e = arr.length-1;
        while (s <= e) {
            int mid = s+(e-s)/2;
            int num = arr[mid];
            if (num == target)
                return mid;
            else if (num < target)
                s = m+1;
            else 
                e = m-1;
        }

        return -1;
    }
}

/*
    Time Complexity: O(log n)
    Space Complexity: O(1)
*/