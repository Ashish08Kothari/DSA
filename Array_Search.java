class Solution {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(new Solution().search(arr, 1));
    }

    public int search(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++)
            if(arr[i] == x)
                return i;
        
        return -1;
    }
}

/*
    Time Complexity: O(n)
    Space Complexity: O(1)
*/